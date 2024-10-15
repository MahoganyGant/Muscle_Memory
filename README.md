## Muscle Memory Notes

What is a sentinel? : Described a sa special value used as a condition of termination
example: " when this condition is met stop" 

# Understanding method Headers
First line of a method is called the header, in order the header is as follows:
Access Modifier, Non access Modifier(optional), Data type, name of method(Parameter list which specifies th data needed to complete this function){}
A.M- specfies what type of access everyone has to this method
N.A.M- keywords that change the behavior of a class, method, or variable, but doesn't control their accessibility (Static,final,abstract) there are more but these are the ones I've used 
N.O.M- as a convention it should began with a verb unless it's a boolean then it should ask a question

Variables can only be used within the scope in which they are declared 
Methods can only return one value, if your method needs to return more than one value that's a sign you can break that method up into more methods

# Searching Arrays:
Sequential search-searches entire array
Binary search- array must be in size order, begins in the middle in the array and determines in that value is larger or smaller than the value you are searching for to eliminate half of the array from the search list
it continues this until it has gone through the entire array or your value is found
Array.BinarySearch

# New comment use
Place Javadoc comments near your methods to give directions for how your methods are to be used when people call your method, decreasing the time it may take to go to the specific location of that method to review
/**enter to start a javadoc comment

# Overloading methods
- same name, different parameter list 
