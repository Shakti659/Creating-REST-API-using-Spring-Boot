package das.shaktiprakash.journalAppp.controller;

import das.shaktiprakash.journalAppp.entity.JournalEntry;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/journal")
public class JournalEntryControllerV2 {


    @GetMapping
    public List<JournalEntry> getAll() {
        return null;
    }

    @PostMapping
    public boolean createEntry(@RequestBody JournalEntry myEntry) {

        return true;
    }

    @GetMapping("id/{myId}")
    public JournalEntry getJournalEntryById(@PathVariable long myId) {
        return null;

    }

    @DeleteMapping("id/{myId}")
    public JournalEntry deleteJournalEntryByid(@PathVariable Long myId) {
        return null;
    }

    @PutMapping("/id/{id}")
    public JournalEntry updateJournalEntryById(@PathVariable Long id, @RequestBody JournalEntry myEntry) {
        return null;
    }
}
