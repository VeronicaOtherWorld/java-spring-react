package com.lulu.learningspringframework02.example.a7_springStereotype;

public class SpringStereotype {
}


/***** spring stereotype annotations
 *
 * @componenet - generic annotation application
 *   basic for all spring stereotype annotation
 *  @service indicates that an annotated class has business logic
 *  @controller indicates that an annotated class is a controller
 *  (e.g. a web controller)
 *  used to define controllers in your web applications and rest api
 *  @repository indicates that an annotated class is used to retrieve and / or manipulate data in a database
 *
 *
 *
 * why!
 * by using a specific annotation, you are giving more information to the framework about your intentions
 *
 * you can use AOP at a later point to add additional behavior
 *  (for repository, spring automatically wires in JDBC exception translation features)
 */
