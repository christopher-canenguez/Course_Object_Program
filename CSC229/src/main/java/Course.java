/**
 * Course -- Blueprint class for creating Course objects.
 *
 * @author (Christopher Canenguez)
 * @version (9.7.2021)
 */

public class Course
{
    // Properties for objects of type Course.
    private String theName, theId, theCode;
    
    // Default constructor for Course object.
    public Course()
    {
         // Default constructor, therefore empty.
         System.out.println("This is the default constructor for objects of type Course.");
    }
    
    /**
    * Constructor for objects of class Course
    * 
    * @param name - name of course
    * @param id - id of course
    * @param code - code of course
    */
    public Course(String name, String id, String code)
    {
         this.theName = name;
         this.theId = id;
         this.theCode = code;
    }
    
    /**
    * getName -- return name of course
    * 
    * @return -- String, name of course 
    */
    public String getName()
    {
         return this.theName;
    }
    
    /**
    * setName -- Allows the name of course to be updated.
    * 
    * @param newName -- the new name for course to be updated to.
    */
    public void setName(String newName)
    {
        this.theName = newName;
    }
    
    /**
    * getId -- return id of course.
    * 
    * @return -- String, id of course
    */
    public String getId()
    {
        return this.theId;
    }
    
    /**
    * setId -- update the ID of the course.
    * 
    * @param newId -- new ID for the course.
    */
    public void setId(String newId)
    {
        this.theId = newId;
    }
    
    /**
    * getCode -- returns code of course.
    * 
    * @return -- String, code of course.
    */
    public String getCode()
    {
        return this.theCode;
    }
    
    /**
    * setCode -- updates the code of the course.
    * 
    * @param newCode -- new code for course.
    */
    public void setCode(String newCode)
    {
        this.theCode = newCode;
    }
    
    /**
     * toString -- prints out information of Course object.
     * 
     * @return -- String of information
     */
    @Override
    public String toString()
    {
        String result = 
        "Course name: " + this.getName() + "\n" +
        "Course Id: " + this.getId() + "\n" +
        "Course code: " + this.getCode();
        
        return result;
    }
    
    // Main function.
    public static void main(String args[])
    {
        // Create Course object using default constructor.
        Course myCourse = new Course();
        System.out.println(); // Empty line
        
        // Create Course object using overloaded constructor.
        Course course2 = new Course("Discrete Structures", "001", "123");
        
        // Print course2 info before changing attributes.
        System.out.println("Before change: " + "\n" + course2.toString());
        System.out.println(); // Empty line
        
        // Change attributes of course2.
        course2.setName("Calculus 2");
        course2.setId("172");
        course2.setCode("789");
        
        // Print out course2 info after using set methods to change attributes.
        System.out.println(course2.toString());
        
    }
    
 }