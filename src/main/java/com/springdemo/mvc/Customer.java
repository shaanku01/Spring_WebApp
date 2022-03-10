package com.springdemo.mvc;
import validation.CourseCode;

import javax.validation.constraints.*;

public class Customer {
    private String firstName;


   @NotNull(message="is required")
   @Size(min=1 , message="is required")
   private String lastName;

   @Min(value = 0 , message = "Must be greater than or equal to zero")
   @Max(value = 10 , message = "Must be less than or equal to ten")
   @NotNull(message = "is Required")
   private Integer freePasses;

   @Pattern(regexp = "^[a-zA-Z0-9]{5}", message = "Only 5 Chars/Digits")
   private String postalCode;

   @CourseCode
   private String courseCode;

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getFreePasses() {
        return freePasses;
    }

    public void setFreePasses(Integer freePasses) {
        this.freePasses = freePasses;
    }
}
