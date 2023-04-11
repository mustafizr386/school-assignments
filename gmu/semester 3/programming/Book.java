class Book{ private int isbn; 
   public Book(int isbn) { super(); this.isbn = isbn; } 
   public int getIsbn() { 
      return isbn; } 
   public void setIsbn(int isbn) { this.isbn = isbn; } 
   public int hashCode() { 
      return isbn; } 
   public boolean equals( Object obj ) { boolean res = false; Book book = ( Book )obj; 
      if( book.getIsbn() == isbn ) res = true; 
      return res; } }