package spellingbee.core.managers;

import spellingbee.core.exceptions.*;

public interface GameService {
    void create(String letters) throws PangramNotFoundException, NotEnoughWordsException, IllegalPointRangeException, IllegalLettersLengthException, NotUniqueLettersException;

    void create() throws PangramNotFoundException, NotEnoughWordsException, IllegalPointRangeException;
}
