package com.dbs.PayZ.util;

import java.util.Optional;
import java.util.stream.Stream;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.apache.commons.io.FileUtils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
public class Utility {
    public static <T> ResponseEntity<T> fromOpt (Optional<T> obj){
        System.out.println(new ResponseEntity<>(HttpStatus.NOT_FOUND));
        if(!obj.isPresent())
          return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        return ResponseEntity.ok().body(obj.get());
    } 
    public static boolean searchInFile(String text, File file){
      try {
        return FileUtils.readFileToString(file,StandardCharsets.UTF_8.name()).contains(text);        
        // Stream<String> lines = new BufferedReader(new InputStreamReader((new InputStream(file),StandardCharsets.UTF_8.name())).lines();
      } catch (IOException e) {
        System.out.println("Something wrong with file");
        return false;
      }
    }
}
