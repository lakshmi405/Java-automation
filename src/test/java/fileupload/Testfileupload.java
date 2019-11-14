package fileupload;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Testfileupload extends BaseTest {
    @Test
    public void testUpload() {
        var File = homePage.fileuploadMathod();
        File.selectFile("C:\\Users\\naresh.kumar\\IdeaProjects\\webdriver_java\\resoures1\\chromedriver.exe");
       // var File1= homePage.fileuploadMathod();
        String New=File.uploadedFile();
        Assert.assertEquals(File.uploadedFile(),"chromedriver.exe" ,"file not uploaded");

    }
  /*  @Test
            public void resultFile()
    {
        var File1= homePage.fileuploadmathod();
         String New=File1.uploadedFile();
            Assert.assertEquals(File1.uploadedFile(),"chromedriver.exe" ,"file not uploaded");



    }*/
}
