package guru.springframework.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created on 8/9/2025 by Jesse H.
 * Package: Controllers; Class: ControllerExceptionHandler
 * Controller Exception Handler
 */

@Slf4j
@ControllerAdvice
@Order(value = 1) // Set precedence to 1 so that this is run before controller methods
public class ControllerExceptionHandler {

    @ResponseStatus(code = HttpStatus.BAD_REQUEST)
    @ExceptionHandler(NumberFormatException.class)
    public ModelAndView handleNumberFormatException(Exception exception){

        log.error("Handling Bad Request Exception");
        log.error(exception.getMessage());

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("400error");
        // Due to Spring's and Thymeleaf's Security configs, .getMessage will fail
        // in the 400error template. Pass it as a string and call that instead
        modelAndView.addObject("exceptionMessage", exception.getMessage());

        return modelAndView;
    }
}
