package com.example.Java_Spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/tags")
public class TagController {
    @Autowired
        private TagService tagService;

    @GetMapping
        public ResponseEntity<List<Tag>> getAllTags() {
        return ResponseEntity.ok(tagService.getAllTags());
        }

    @PostMapping
        public ResponseEntity<Tag> createNewTag(@RequestBody Tag tag) {
        return ResponseEntity.ok(tagService.createTag(tag));

  }
}
