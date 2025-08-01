package das.shaktiprakash.journalAppp.service;

import das.shaktiprakash.journalAppp.entity.JournalEntry;
import das.shaktiprakash.journalAppp.repository.JournalEntryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class JournalEntryService {

    @Autowired
    private JournalEntryRepository journalEntryRepository;

    public void saveEntry(JournalEntry journalEntry){
        journalEntryRepository.save(journalEntry);

//Controller --> service ---> repository
    }
}
