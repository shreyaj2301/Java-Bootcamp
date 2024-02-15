 class ID1
 
{
    public static void main(String[] args) 
    {
        int i = 11;
         
        i = i++ + ++i;        
        System.out.println(i);
    }
}

//int i=11
//i++ is use current value and add 1 ( in post increment or decrement  use value first then increment or decrement)
//i++ is 11 befor increment
// new value is i++ is 12
//++i is first increment the value by1 then use this value(in pre increment or decrement first increment or decrement the value and then use)
//  value is ++i is 13
//i++ = 11 use this in equation because  post increment
// so i++ + ++i
//11+13=24