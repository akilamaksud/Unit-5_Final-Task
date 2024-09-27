package utils;

import java.io.File;

import aquality.selenium.browser.AqualityServices;
import lombok.experimental.UtilityClass;

@UtilityClass
public class BrowserUtils {
    public boolean isFileDownloaded(String fileName) {
        String downloadDirectory = AqualityServices.getBrowser().getDownloadDirectory();
        File file = new File(downloadDirectory + File.separator + fileName);
        return FileUtils.isFileExist(file);
    }

}
