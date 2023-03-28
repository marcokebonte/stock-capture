/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bright_futures;
import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author dkebo
 */
public class Products
{
    
    String[] product_code;
    int arraySize = 1;
    int product_counter = 0;
    String[] product_name;
    String[] product_category;
    String[] product_warranty;
    double[] product_price;
    int[] product_stock_level;
    String[] product_supplier;

   
    
    
    //Constructor method for different arrays used
    public Products()
    {
        this.product_code = new String[arraySize];
        this.product_name = new String[arraySize];
        this.product_category = new String[arraySize];
        this.product_warranty = new String[arraySize];
        this.product_price = new double[arraySize];
        this.product_stock_level = new int[arraySize];
        this.product_supplier = new String[arraySize];
    }
    
    
    
    
   //-------------------------------------------------------------------------------------------------------- 
    //Method that starts the program
    public void Start()
    {
        Scanner start_input = new Scanner(System.in);
        int program_start;
        
        System.out.println("BRIGHT FUTURE TECHNOLOGY APPLICATION");
        System.out.println("*********************************************");
        System.out.println("Enter (1) to launch menu or any other number to exit");
            program_start = start_input.nextInt();
            if (program_start == 1)
            {
                this.DisplayMenu();
            }else{
                this.ExitApplication();
            }
      
    }//End of method
    
    
    //----------------------------------------------------------------------------------------------------------------
    //Method that displays a menu to select different functions within the program
    public void DisplayMenu(){
        Scanner menu_input = new Scanner(System.in);
        
        System.out.println("Please select one of the following menu items: ");
        System.out.println("(1) Capture a new product\n"
                         + "(2) Search for a product\n"
                         + "(3) Update a product\n"
                         + "(4) Delete a product\n"
                         + "(5) Print Report\n"
                         + "(6) Exit application");
       
        int menu_SELECTION = menu_input.nextInt();
        
       switch (menu_SELECTION) {
           
           case 1:
               this.CaptureProduct();
               break;
               
           case 2:
               this.SearchProduct();
               break;
               
           case 3:
               this.UpdateProduct();
               break;
               
           case 4:
               this.DeleteProduct();
               break;
               
           case 5:
               this.PrintReport();
               break;
               
           case 6:
               this.ExitApplication();
               break;
               
           default:
               System.out.println("The input you have entered is incorrect, please try again");
               this.DisplayMenu(); 
       }
    }//End of method 
    
    
    
    //-----------------------------------------------------------------------------------------------------------
    //Method that allows the user to capture the information of a new product
    public void CaptureProduct(){
        Scanner capture_code = new Scanner(System.in);
        Scanner capture_name = new Scanner(System.in);
        Scanner capture_category = new Scanner(System.in);
        Scanner capture_warranty = new Scanner(System.in);
        Scanner capture_price = new Scanner(System.in);
        Scanner capture_stock = new Scanner(System.in);
        Scanner capture_supplier = new Scanner(System.in);
        Scanner capture_menu = new Scanner(System.in);
        
        String product_code = "";
        String product_name = "";
        String product_supplier = "";
        String product_warranty_status = "";
        int product_category = 0;
        int product_warranty = 0;
        int product_stock_level = 0;
        int return_menu;
        double product_price = 0;
        
        
        System.out.println("CAPTURE A NEW PRODUCT");
        System.out.println("***********************************");
        System.out.println("Enter the product code: " );
            product_code = capture_code.next();
            this.product_code[this.product_counter] = product_code;
        System.out.println("Enter the product name: ");
            product_name = capture_name.next();
            this.product_name[this.product_counter] = product_name;
        System.out.println("Select the product category: \n"
                         + "Desktop Computer - 1\n "
                         + "Laptop - 2\n"
                         + "Tablet - 3\n"
                         + "Printer - 4\n"
                         + "Gaming console - 5");
        System.out.println("Product Category >> ");
            product_category = capture_category.nextInt();
            
       
            switch (product_category){
                case 1:
                    this.product_category[this.product_counter] = "Desktop computer";
                    break;
                    
                case 2:
                    this.product_category[this.product_counter] = "Laptop";
                    break;
                    
                case 3:
                    this.product_category[this.product_counter] = "Tablet";
                    break;
                    
                case 4:
                    this.product_category[this.product_counter] = "Printer";
                    break;
                    
                case 5: 
                    this.product_category[this.product_counter] = "Gaming Console";
                    break;
                    
                default:
                    System.out.println("Input invalid, please try again");
                     System.out.println("Select the product category: \n"
                         + "Desktop Computer - 1\n "
                         + "Laptop - 2\n"
                         + "Tablet - 3\n"
                         + "Printer - 4\n"
                         + "Gaming console - 5");
                            System.out.println("Product Category >> ");
                               product_category = capture_category.nextInt();
            
            }
            
            
            System.out.println("Indicate the product warranty. Enter (1) for 6 months or any other key for 2 years");
                product_warranty = capture_warranty.nextInt();
            
                if (product_warranty == 1)
                {
                    product_warranty_status = "6 months";
                    this.product_warranty[this.product_counter] = product_warranty_status; 
                }else{
                   product_warranty_status = "2 years";
                   this.product_warranty[this.product_counter] = product_warranty_status;
                }
        
                
        System.out.println("Enter the price for " + product_name + " >> ");
            product_price = capture_price.nextDouble();
            this.product_price[this.product_counter] = product_price;
            
        System.out.println("Enter the stock level for " + product_name + " >> ");
            product_stock_level = capture_stock.nextInt();
            this.product_stock_level[this.product_counter] = product_stock_level;
            
        System.out.println("Enter the supplier for " + product_name + " >> ");
            product_supplier = capture_supplier.nextLine();
            this.product_supplier[this.product_counter] = product_supplier;
            
        System.out.println("Product details have been saved successfully!!");
           
        
       
      
        System.out.println("Enter (1) to launch menu or (2) to exit");
            return_menu = capture_menu.nextInt();
            if (return_menu == 1)
            {
                this.DisplayMenu();
                 this.product_counter++;
                    this.arraySize++;
            }else if(return_menu == 2)
            {
              this.ExitApplication();
            }
            
    }//End of method
    
    
    
    //-----------------------------------------------------------------------------------------------------------------
    //Method used to search array for specific value provided
    public boolean arrSearch(String[] arr, String toCheckValue)
    {
       
        boolean test  = Arrays.asList(arr).contains(toCheckValue);
        return test;
    }
    
    
    
    
    //-------------------------------------------------------------------------------------------------------------------------
    //Method used to search for a product that has been captured
    public void SearchProduct(){
        Scanner search_input = new Scanner(System.in);
        String product_search_code = "";
        int product_index;
        int return_menu;
        
        System.out.println("*******************************************************");
        System.out.println("Please enter the product code to search: ");
            product_search_code = search_input.next();
            boolean present = this.arrSearch(this.product_code, product_search_code);
           
        
                for (int i = 0; i < this.product_code.length; i++)
                {
                    if(present == true)
                    {
                          System.out.println("******************************************************************************");   
                          System.out.println("PRODUCT SEARCH RESULTS");
                          System.out.println("******************************************************************************");
                          System.out.println("PRODUCT CODE:             \t" + this.product_code[i]);
                          System.out.println("PRODUCT NAME:             \t" + this.product_name[i]);
                          System.out.println("PRODUCT WARRANTY:         \t" + this.product_warranty[i]);
                          System.out.println("PRODUCT CATEGORY:         \t" + this.product_category[i]);
                          System.out.println("PRODUCT PRICE:            \tR" + this.product_price[i]);
                          System.out.println("PRODUCT STOCK LEVELS:     \t" + this.product_stock_level[i]);
                          System.out.println("PRODUCT SUPPLIER:         \t" + this.product_supplier[i]);
                          System.out.println("******************************************************************************");
                          System.out.println("Enter (1) to launch menu or (2) to exit");
                            return_menu = search_input.nextInt();
                                if (return_menu == 1)
                                {
                                    this.DisplayMenu();
                                }else if(return_menu == 2)
                                {
                                    this.ExitApplication();
                                }
                    }else{
                        System.out.println("This product cannot be located. Invalid Product");
                        System.out.println("Enter (1) to launch menu or any other number to exit");
                            return_menu = search_input.nextInt();
                                if (return_menu == 1)
                                {
                                    this.DisplayMenu();
                                }else
                                {
                                    this.ExitApplication();
                                }
                       
                    }
                }
     
         
    }//End of method
    
    
    
    
    //----------------------------------------------------------------------------------------------------------------------
    //Method used to update a method that has been captured
    public void UpdateProduct(){
        Scanner update_input = new Scanner(System.in);
        String product_update_code;
        String update_warranty = "";
        String update_price_prompt = "";
        int update_stock_level;
        String update_stock_prompt = "";
        String product_warranty_status = "";
        double update_price;
        int return_menu;
        
        
        System.out.println("*******************************************************");
        System.out.println("Please enter the product code to update: ");
            product_update_code = update_input.next();
            boolean present = this.arrSearch(this.product_code, product_update_code);
                    
            
            
            for (int i = 0; i < this.product_code.length; i++)
            {
                if (present == true)
                {
                    System.out.println("Update the warranty?    (y) Yes     (n) No");
                        update_warranty = update_input.next();
                        
                            if (update_warranty.equalsIgnoreCase("y"))
                            {
                                System.out.println("Indicate the product warranty. Enter (1) for 6 months or any other key for 2 years");
                                int product_warranty = update_input.nextInt();
            
                                     if (product_warranty == 1)
                                     {
                                         product_warranty_status = "6 months";
                                         this.product_warranty[i] = product_warranty_status; 
                                     }else
                                     {
                                         product_warranty_status = "2 years";
                                        this.product_warranty[i] = product_warranty_status;
                                     }
                            }
                           
                    System.out.println("Update the product price?       (y) Yes     (n) No");
                        update_price_prompt = update_input.next();
                                    
                            if (update_price_prompt.equalsIgnoreCase("y"))
                            {
                                  System.out.println("Enter the new price for " + this.product_name[i] + " : ");
                                       update_price = update_input.nextDouble();
                                          this.product_price[i] = update_price;
                            }
                               
                            
                            
                            
                    System.out.println("Update the stock level?     (y) Yes     (n) No");
                        update_stock_prompt = update_input.next();
                            
                        
                            if (update_stock_prompt.equalsIgnoreCase("y"))
                            {
                                System.out.println("Enter the new stock level for " + this.product_name[i] + " : ");
                                    update_stock_level = update_input.nextInt();
                                        this.product_stock_level[i] = update_stock_level;
                                
                            }
                   
                    System.out.println("Products have been updated successfully!!!");
                    System.out.println("Enter (1) to launch menu or any other number to exit");
                            return_menu = update_input.nextInt();
                                if (return_menu == 1)
                                {
                                    this.DisplayMenu();
                                }else
                                {
                                    this.ExitApplication();
                                }
                    
                    
                    
                }else
                {
                    System.out.println("This product cannot be located. Invalid Product");
                        System.out.println("Enter (1) to launch menu or any other number to exit");
                            return_menu = update_input.nextInt();
                                if (return_menu == 1)
                                {
                                    this.DisplayMenu();
                                }else
                                {
                                    this.ExitApplication();
                                }
                       
                }
            }
                       
       
    }//End of method
    
    
    
    //-----------------------------------------------------------------------------------------------------------------------
    //Method used to delete a product that has been captured
    public void DeleteProduct(){
        Scanner delete_input = new Scanner(System.in);
        String product_delete_code = "";
        int product_index;
        int delete_confirm;
        int return_menu;
        
        
        System.out.println("*******************************************************");
        System.out.println("Please enter the product code to delete: ");
            product_delete_code = delete_input.next();
            boolean present = this.arrSearch(this.product_code, product_delete_code);
        
                if (present == true)
                {
                    System.out.println("******************************************************");
                    System.out.println("WARNING!!!!\n"
                         + "You are about to delete a product. Do you want to continue?\n"
                         + "Enter (1) to confirm or any other number to return to the menu");  
                                delete_confirm = delete_input.nextInt();
                    
                                for (int i = 0; i < this.product_code.length; i++)
                                {
                                    if (delete_confirm == 1)
                                    {
                                        
                                        System.out.println("******************************************************************************");   
                                        System.out.println("PRODUCT DELETE RESULTS");
                                        System.out.println("******************************************************************************");
                                        System.out.println("PRODUCT CODE:             \t" + this.product_code[i]);
                                        System.out.println("PRODUCT NAME:             \t" + this.product_name[i]);
                                        System.out.println("PRODUCT WARRANTY:         \t" + this.product_warranty[i]);
                                        System.out.println("PRODUCT CATEGORY:         \t" + this.product_category[i]);
                                        System.out.println("PRODUCT PRICE:            \tR" + this.product_price[i]);
                                        System.out.println("PRODUCT STOCK LEVELS:     \t" + this.product_stock_level[i]);
                                        System.out.println("PRODUCT SUPPLIER:         \t" + this.product_supplier[i]);
                                        System.out.println("******************************************************************************");
                                            this.product_code[i] = null;
                                            this.product_name[i] = null;
                                            this.product_warranty[i] = null;
                                            this.product_category[i] = null;
                                            this.product_price[i] = 0;
                                            this.product_stock_level[i] = 0;
                                            this.product_supplier[i] = null;
                                        System.out.println("THIS PRODUCT HAS BEEN SUCCESSFULLY DELETED");
                                       
                                    }else{
                                        this.DisplayMenu();
                                    }
                                
                    
                                }
                        
                }else
                {
                   System.out.println("This product cannot be located. Invalid Product");
                        System.out.println("Enter (1) to launch menu or any other number to exit");
                            return_menu = delete_input.nextInt();
                                if (return_menu == 1)
                                {
                                    this.DisplayMenu();
                                }else
                                {
                                    this.ExitApplication();
                                } 
                }
            
            
    }//End of method
    
    
    
    
    
    //------------------------------------------------------------------------------------------------------------------
    //Method that prints out a report of the products captured
    public void PrintReport(){
        
        System.out.println("PRODUCTS REPORT");
        System.out.println("********************************************************************");
        
        for (int i = 0; i < this.product_counter + 1; i++)
        {
            System.out.println("PRODUCT " + this.product_counter);
            System.out.println("-------------------------------------------------------------------");
            System.out.println("PRODUCT CODE:             \t" + this.product_code[i]);
            System.out.println("PRODUCT NAME:             \t" + this.product_name[i]);
            System.out.println("PRODUCT WARRANTY:         \t" + this.product_warranty[i]);
            System.out.println("PRODUCT CATEGORY:         \t" + this.product_category[i]);
            System.out.println("PRODUCT PRICE:            \tR" + this.product_price[i]);
            System.out.println("PRODUCT STOCK LEVELS:     \t" + this.product_stock_level[i]);
            System.out.println("PRODUCT SUPPLIER:         \t" + this.product_supplier[i]);
            System.out.println("--------------------------------------------------------------------");
            
        
        }
        
    }//End of method
    
    
    //Method that exits the application
    public void ExitApplication(){
        
        
        System.out.println("GoodBye :)");
    }//End of method
        
}//End of class
//------------------------------------------------------------------------oooo0000End of File0000oooo---------------------------------------------------
