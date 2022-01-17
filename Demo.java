class Demo 
{
	int pCode=121;
	char pName='A';
    	int pPrice=1200;
    	int pQty=100;	
	  //Primitive DataType Instance Variables memory in Object
	void getProduct()	//Instance method memory in Object
	{
		System.out.println("ProdCode="+pCode);
        		System.out.println("ProdName="+pName);
        		System.out.println("ProdPrice="+pPrice);
        		System.out.println("ProdQty="+pQty);
	}
	public static void main(String[] args) 
	{
		Demo p = new Demo();
		p.getProduct();	//method_Call
	}
}
