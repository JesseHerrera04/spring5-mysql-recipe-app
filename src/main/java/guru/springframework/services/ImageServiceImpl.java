package guru.springframework.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

/**
 * Created on 8/4/2025 by Jesse H.
 * Package: Services; Class: ImageServiceImpl
 * Image Service Implementation
 */

@Slf4j
@Service
public class ImageServiceImpl implements ImageService {

    @Override
    public void saveImageFile(Long recipeId, MultipartFile imageFileName) {

        log.debug("Received a file");

    }
}
