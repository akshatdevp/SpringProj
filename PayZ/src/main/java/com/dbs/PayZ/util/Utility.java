
package com.dbs.PayZ.util;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.List;
import java.util.Optional;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class Utility {
	public static <T> ResponseEntity<T> fromOpt (Optional<T> obj){
		// System.out.println(new ResponseEntity<>(HttpStatus.NOT_FOUND));
		if(!obj.isPresent())
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		return ResponseEntity.ok().body(obj.get());
	} 

	public static boolean searchInFile(String s, File file)
	{
    System.out.println("searching using util");
		List<String> list;
		try {
			list = Files.readAllLines(file.toPath(),Charset.defaultCharset());
      System.out.println("made list");
			for(int i = 0;i < list.size();i++)
			{
				if(ZSearch(s,list.get(i))){

					return true;
				}
			}
			return false;
		}
		catch (IOException e) {
			return false;
		}

	}
	public static boolean ZSearch(String name, String pattern){

		String tot = name + "$" + pattern;
		int arr[] = ZArr(tot);
		for(int i : arr) if (i==name.length()) return true;
		return false;


	}
	public static int[] ZArr(String text){
    System.out.println(text);
		int n = text.length();
		int[] arr = new int[n];
		int l=0,r=0;
		for(int i = 1; i < n; i++){ // take i as left index.
			if(i<=r)
				arr[i] = Math.min(arr[i-l],r-i+1);
			while(i + arr[i] < n && text.charAt(i+arr[i]) == text.charAt(arr[i]))
				arr[i]++;
			if(i + arr[i] -1 > r)
			{
				l = i;
				r = i + arr[i] - 1;
			}
		}
		return arr;

	}
}
