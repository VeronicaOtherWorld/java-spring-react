package com.lulu.learningspringframework02;

public class ComponentNBean {
}
/**
 *component  and  bean
 *
 * heading                  component                                   bean
 * where                    can be used on any java class               typically used on methods in spring configuration classes
 *
 * easy of use              easy;add an annotation                      you write all the code
 *
 * autowiring               y;field, setter or constructor injection    y;method call or method parameters
 *
 * who creates beans        spring framework                            we write
 *
 * recommended              instantiating beans for your own app        1.custom business logic
 *                          code: @component                            2. instantiating beans for third party
 *
 *
 * **/