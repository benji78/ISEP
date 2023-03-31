package harryPotterProject;

import com.benji.harryPotterProject.model.House;
import com.benji.harryPotterProject.model.Pet;
import com.benji.harryPotterProject.model.characters.Wizard;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CharacterTest {
    // Test case to check if a wizard can take damage
    @Test
    public void testWizardTakeDamage() {
        Wizard wizard = new Wizard("Hermione Granger", House.GRYFFINDOR, Pet.CAT);
        wizard.takeDamage(10);
        assertEquals(wizard.getMaxHealth() - 10, wizard.getHealth());
        wizard.takeDamage(100);
        assertEquals(0, wizard.getHealth());
    }

    // Test case to check if a wizard can heal and not go over max health
    @Test
    public void testWizardHeal() {
        Wizard wizard = new Wizard("Ron Weasley", House.GRYFFINDOR, Pet.RAT);
        wizard.heal(10);
        assertEquals(wizard.getMaxHealth(), wizard.getHealth());
        wizard.takeDamage(20);
        wizard.heal(10);
        assertEquals(wizard.getMaxHealth() - 10, wizard.getHealth());
    }
}
