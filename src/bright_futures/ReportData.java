/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bright_futures;

/**
 *
 * @author dkebo
 */
public class ReportData
{
    
//    public Products myProducts = new Products();
    String[] product_code;
    int arraySize = 1;
    int product_counter = 0;
    String[] product_name;
    String[] product_category;
    String[] product_warranty;
    double[] product_price;
    int[] product_stock_level;
    String[] product_supplier;

    
    
    
    
    //--------------------------------------------------------------------------------------------------
    //Getter methods for all the arrays used
    public String[] getProduct_category()
    {
        return product_category;
    }

    public String[] getProduct_code()
    {
        return product_code;
    }

    public String[] getProduct_name()
    {
        return product_name;
    }

    public double[] getProduct_price()
    {
        return product_price;
    }

    public int[] getProduct_stock_level()
    {
        return product_stock_level;
    }

    public String[] getProduct_supplier()
    {
        return product_supplier;
    }

    public String[] getProduct_warranty()
    {
        return product_warranty;
    }

    
    
    
    //----------------------------------------------------------------------------------------------------------
    //Setter methods for all the arrays used
    public void setProduct_category(String[] product_category)
    {
        this.product_category = product_category;
    }

    public void setProduct_code(String[] product_code)
    {
        this.product_code = product_code;
    }

    public void setProduct_counter(int product_counter)
    {
        this.product_counter = product_counter;
    }

    public void setProduct_name(String[] product_name)
    {
        this.product_name = product_name;
    }

    public void setProduct_price(double[] product_price)
    {
        this.product_price = product_price;
    }

    public void setProduct_stock_level(int[] product_stock_level)
    {
        this.product_stock_level = product_stock_level;
    }

    public void setProduct_supplier(String[] product_supplier)
    {
        this.product_supplier = product_supplier;
    }

    public void setProduct_warranty(String[] product_warranty)
    {
        this.product_warranty = product_warranty;
    }

  
    
        
 }//End of class
//------------------------------------------------------------oooo0000END OF FILE0000oooo------------------------------------------------------------------
    
    
    
    
    
    
    
