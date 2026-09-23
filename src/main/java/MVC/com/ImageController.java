package MVC.com;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ImageController {

//	@GetMapping("/image")
//	public String doGetImg() {
//		return "img";
//	}
	
	@GetMapping(value="/image", produces = "image/jpeg")
    @ResponseBody
    public byte[] doGetImg() throws IOException {

        return Files.readAllBytes(Path.of("src/main/resources/static/img.jpg"));
    }
}
