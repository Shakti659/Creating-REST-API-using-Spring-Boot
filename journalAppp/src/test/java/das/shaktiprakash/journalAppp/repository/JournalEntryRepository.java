package das.shaktiprakash.journalAppp.repository;

import das.shaktiprakash.journalAppp.entity.JournalEntry;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface JournalEntryRepository extends MongoRepository<JournalEntry, String> {


}
