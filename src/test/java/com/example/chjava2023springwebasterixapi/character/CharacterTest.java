package com.example.chjava2023springwebasterixapi.character;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.List;
import java.util.Optional;

import static org.mockito.Mockito.*;

public class CharacterTest {


    @Test
    void testFindAllCharacters() {

        //GIVEN
        AsterixRepository repo = mock(AsterixRepository.class);
        Mockito.when(repo.findAll()).thenReturn(
                List.of(
                        new Character("1", "Asterix", 35, "-")
                )
        );

        //WHEN

        AsterixService service = new AsterixService(repo);

        List<Character> actual = service.findAll();

        List<Character> expected = List.of(
                new Character("1", "Asterix", 35, "-")
        );

        //THEN

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findCharaterById() {
        AsterixRepository repo1 = Mockito.mock(AsterixRepository.class);
        Mockito.when(repo1.findById("1")).thenReturn(
                Optional.of(new Character("1", "Asterix", 35, "-"))
        );

        AsterixService underTest = new AsterixService(repo1);

        Optional<Character> actual = underTest.findById("1");

        Assertions.assertEquals(35, actual.get().age());
        Mockito.verify(repo1).findById("1");
    }
}




