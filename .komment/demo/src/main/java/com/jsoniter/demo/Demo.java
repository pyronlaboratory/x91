{"name":"Demo.java","path":"demo/src/main/java/com/jsoniter/demo/Demo.java","content":{"structured":{"description":"A `Demo` class that uses the `JsonIter` package to work with JSON data. The code initializes the `JsonIter` configuration, deserializes a JSON object into a `User` object, and then serializes the `User` object back to JSON using `JsonIter`. The code also demonstrates how to attach an array of integers to the `User` object using the `Any` class from the `jsoniter-any` package.","image":"<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"no\"?>\n<!DOCTYPE svg PUBLIC \"-//W3C//DTD SVG 1.1//EN\"\n \"http://www.w3.org/Graphics/SVG/1.1/DTD/svg11.dtd\">\n<!-- Generated by graphviz version 2.43.0 (0)\n -->\n<!-- Title: com.jsoniter.JsonIterator Pages: 1 -->\n<svg width=\"144pt\" height=\"82pt\"\n viewBox=\"0.00 0.00 144.00 82.00\" xmlns=\"http://www.w3.org/2000/svg\" xmlns:xlink=\"http://www.w3.org/1999/xlink\">\n<g id=\"graph0\" class=\"graph\" transform=\"scale(1 1) rotate(0) translate(4 78)\">\n<title>com.jsoniter.JsonIterator</title>\n<!-- Node1 -->\n<g id=\"Node000001\" class=\"node\">\n<title>Node1</title>\n<g id=\"a_Node000001\"><a xlink:title=\" \">\n<polygon fill=\"#999999\" stroke=\"#666666\" points=\"136,-19 0,-19 0,0 136,0 136,-19\"/>\n<text text-anchor=\"middle\" x=\"68\" y=\"-7\" font-family=\"Helvetica,sans-Serif\" font-size=\"10.00\">com.jsoniter.JsonIterator</text>\n</a>\n</g>\n</g>\n<!-- Node2 -->\n<g id=\"Node000002\" class=\"node\">\n<title>Node2</title>\n<g id=\"a_Node000002\"><a xlink:title=\" \">\n<polygon fill=\"white\" stroke=\"#666666\" points=\"100.5,-74 35.5,-74 35.5,-55 100.5,-55 100.5,-74\"/>\n<text text-anchor=\"middle\" x=\"68\" y=\"-62\" font-family=\"Helvetica,sans-Serif\" font-size=\"10.00\">Closeable</text>\n</a>\n</g>\n</g>\n<!-- Node2&#45;&gt;Node1 -->\n<g id=\"edge1_Node000001_Node000002\" class=\"edge\">\n<title>Node2&#45;&gt;Node1</title>\n<g id=\"a_edge1_Node000001_Node000002\"><a xlink:title=\" \">\n<path fill=\"none\" stroke=\"#63b8ff\" d=\"M68,-44.66C68,-35.93 68,-25.99 68,-19.09\"/>\n<polygon fill=\"#63b8ff\" stroke=\"#63b8ff\" points=\"64.5,-44.75 68,-54.75 71.5,-44.75 64.5,-44.75\"/>\n</a>\n</g>\n</g>\n</g>\n</svg>\n","diagram":"digraph G {\n    label=\"com.jsoniter.demo.Demo\"\n    bgcolor=\"#151719\"\n    fontcolor=\"#ECEDED\"\n    splines=ortho\n    fontname=\"Courier New\"\n    edge [color=\"#26de81\"]\n    node [style=filled,color=\"#717D86\", shape=rectangle, fontname=\"Courier New\"];\n    \n}\n","items":[{"id":"126e693b-043f-c3a8-ae40-529fa90f0f1f","ancestors":[],"type":"function","description":"is a Java file that utilizes the JSONIter library to perform deserialization and serialization of a User object. The class has a single main method where a User object is created from a JSON string, and then its fields are printed to the console. Additionally, the User object's attachment is set to an array of integers.","name":"Demo","code":"public class Demo {\n    static {\n        // ensure the jsoniter is properly setup\n        new DemoCodegenConfig().setup();\n    }\n\n    public static void main(String[] args) {\n        User user = JsonIterator.deserialize(\"{\\\"firstName\\\": \\\"tao\\\", \\\"lastName\\\": \\\"wen\\\", \\\"score\\\": \\\"1024\\\"}\", User.class);\n        System.out.println(user.firstName);\n        System.out.println(user.lastName);\n        System.out.println(user.score);\n        user.attachment = Any.wrapArray(new int[]{1, 2, 3});\n        System.out.println(JsonStream.serialize(user));\n    }\n}","location":{"start":9,"insert":9,"offset":" ","indent":0,"comment":null},"item_type":"class","length":15,"docLength":null},{"id":"ccd38c74-593c-698e-aa49-aa8758303ccb","ancestors":["126e693b-043f-c3a8-ae40-529fa90f0f1f"],"type":"function","description":"1) deserializes a JSON object into an instance of `User`, 2) accesses and prints properties of the `User` object, 3) wraps an array of integers in an `Any` object, and 4) serializes the modified `User` object to JSON.","params":[{"name":"args","type_name":"String[]","description":"0 or more command-line arguments passed to the program when it is launched, and is ignored in this case since no usage is specified in the `main` method.\n\n* The `args` array is passed to the `main` method as an argument.\n* The `args` array has a fixed length, which can be determined at runtime using the `length` property.\n* Each element in the `args` array can be accessed using its index, starting from 0.\n* The `args` array is an instance of the `String[]` class.","complex_type":true}],"name":"main","code":"public static void main(String[] args) {\n        User user = JsonIterator.deserialize(\"{\\\"firstName\\\": \\\"tao\\\", \\\"lastName\\\": \\\"wen\\\", \\\"score\\\": \\\"1024\\\"}\", User.class);\n        System.out.println(user.firstName);\n        System.out.println(user.lastName);\n        System.out.println(user.score);\n        user.attachment = Any.wrapArray(new int[]{1, 2, 3});\n        System.out.println(JsonStream.serialize(user));\n    }","location":{"start":15,"insert":15,"offset":" ","indent":4,"comment":null},"item_type":"method","length":8,"docLength":null}]}}}