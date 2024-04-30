package com.jsoniter.demo;

import com.jsoniter.JsonIterator;
import com.jsoniter.any.Any;
import com.jsoniter.output.EncodingMode;
import com.jsoniter.output.JsonStream;
import com.jsoniter.spi.DecodingMode;

/**
 * is a Java file that utilizes the JSONIter library to perform deserialization and
 * serialization of a User object. The class has a single main method where a User
 * object is created from a JSON string, and then its fields are printed to the
 * console. Additionally, the User object's attachment is set to an array of integers.
 */
public class Demo {
    static {
        // ensure the jsoniter is properly setup
        new DemoCodegenConfig().setup();
    }

    /**
     * 1) deserializes a JSON object into an instance of `User`, 2) accesses and prints
     * properties of the `User` object, 3) wraps an array of integers in an `Any` object,
     * and 4) serializes the modified `User` object to JSON.
     * 
     * @param args 0 or more command-line arguments passed to the program when it is
     * launched, and is ignored in this case since no usage is specified in the `main` method.
     * 
     * 	- The `args` array is passed to the `main` method as an argument.
     * 	- The `args` array has a fixed length, which can be determined at runtime using
     * the `length` property.
     * 	- Each element in the `args` array can be accessed using its index, starting from
     * 0.
     * 	- The `args` array is an instance of the `String[]` class.
     */
    public static void main(String[] args) {
        User user = JsonIterator.deserialize("{\"firstName\": \"tao\", \"lastName\": \"wen\", \"score\": \"1024\"}", User.class);
        System.out.println(user.firstName);
        System.out.println(user.lastName);
        System.out.println(user.score);
        user.attachment = Any.wrapArray(new int[]{1, 2, 3});
        System.out.println(JsonStream.serialize(user));
    }
}
