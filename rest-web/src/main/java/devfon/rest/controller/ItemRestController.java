package devfon.rest.controller;

import devfon.rest.entity.Item;
import devfon.rest.repository.ItemRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.hateoas.PagedResources;
import org.springframework.hateoas.PagedResources.PageMetadata;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;


@RestController
@RequestMapping("/api/items")
public class ItemRestController {
    private ItemRepository itemRepository;

    public ItemRestController(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getItems(@PageableDefault Pageable pageable) {
        Page<Item> items = itemRepository.findAll(pageable);
        PageMetadata pageMetadata = new PageMetadata(pageable.getPageSize(),
                items.getNumber(), items.getTotalElements());
        PagedResources<Item> resources = new PagedResources<>(items.getContent(), pageMetadata);
        resources.add(linkTo(methodOn(ItemRestController.class).getItems(pageable)).withSelfRel());
        return ResponseEntity.ok(resources);
    }

    @PostMapping
    public ResponseEntity<?> postItem(@RequestBody Item item) {
        itemRepository.save(item);
        return new ResponseEntity<>("{}", HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> putItem(
            @PathVariable("id") Long id,
            @RequestBody Item item
    ) {
        Item persistItem = itemRepository.getOne(id);
        persistItem.update(item);
        itemRepository.save(persistItem);
        return new ResponseEntity<>("{}", HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteItem(
            @PathVariable("id") Long id
    ) {
        itemRepository.deleteById(id);
        return new ResponseEntity<>("{}", HttpStatus.OK);
    }
}
