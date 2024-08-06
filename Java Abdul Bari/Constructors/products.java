

class products
{
    private String itemNo;
    private String name;
    private double price;
    private short qty;
    
    public products(String itemno)
    {
        itemNo=itemno;
    }
    public products(String itemno,String name)
    {
        itemNo=itemno;
        this.name=name;
    }
    public products(String itemno,String name,double price,short qty)
    {
        itemNo=itemno;
        this.name=name;
        setPrice(price);
        setQuantity(qty);
    }
    
    public String getItemNo(){return  itemNo;}
    public String getName(){return name;}
    public double getPrice(){return price;}
    public short getQuantity(){return qty;}
    
    public void setPrice(double price)
    {
        this.price=price;
    }
    public void setQuantity(short qty)
    {
        this.qty=qty;
    }
}

