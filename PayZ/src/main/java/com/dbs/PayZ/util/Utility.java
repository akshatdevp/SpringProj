package com.dbs.PayZ.util;

import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.apache.commons.io.FileUtils;
public class Utility {
    public static <T> ResponseEntity<T> fromOpt (Optional<T> obj){
        System.out.println(new ResponseEntity<>(HttpStatus.NOT_FOUND));
        if(!obj.isPresent())
          return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        return ResponseEntity.ok().body(obj.get());
    } 
    public static boolean searchInFile(String text, File file){
      FileUtils.readFileToString(file).contains(text);
    }
}
