package dropdown;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class Dropdowntest extends BaseTest {
    @Test
    public void testSelectOptions(){
      String option="Option 1";
        var dropDownpage=homePage.clickDropDown();
        dropDownpage.SelectDropdown(option);
        var selectedOptions=dropDownpage.getSelectedOptions();
        assertEquals(selectedOptions.size(),1,"Incorrect no of selections");
        assertTrue(selectedOptions.contains(option),"option not selected");
    }
}
