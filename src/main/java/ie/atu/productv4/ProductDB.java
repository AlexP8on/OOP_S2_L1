package ie.atu.productv4;

public class ProductDB {

      public static Product getProduct(String productCode) {
    // In a more realistic application, this code would get the data for the product from a file or database
    // For now, this code just uses if/else statements to return the correct product data
        Product p = null;

        if (productCode.equalsIgnoreCase("java")) {
            Book myBook = new Book();
            myBook.setCode(productCode);
            myBook.setPrice(57.50);
            myBook.setDescription("ATU Java Programming");
            myBook.setAuthor("Joe Brown");
            p = myBook;
        } else if (productCode.equalsIgnoreCase("jsp")) {
             Book myBook = new Book();
            myBook.setCode(productCode);
            myBook.setDescription("Java Servlets and JSP");
            myBook.setPrice(57.50);
            myBook.setAuthor("Mike White");
            p = myBook;
        } else if (productCode.equalsIgnoreCase("mysql")) {
            Book myBook = new Book();
            myBook.setCode(productCode);
            myBook.setDescription("Lennon's MySQL");
            myBook.setPrice(54.50);
            myBook.setAuthor("Jim Lennon");
            p = myBook;
        }

        if (productCode.equalsIgnoreCase("studios")) {
          Software mySoftware = new Software();
            mySoftware.setCode(productCode);
            mySoftware.setDescription("Visual Studios");
            mySoftware.setPrice(57.50);
            mySoftware.setVersion("Microsoft 1.1");
            p  = mySoftware;
        } else if (productCode.equalsIgnoreCase("eclipse")) {
          Software mySoftware = new Software();
            mySoftware.setCode(productCode);
            mySoftware.setDescription("Build Java apps");
            mySoftware.setPrice(57.50);
            mySoftware.setVersion("Eclipse Neon");
            p = mySoftware;
        } else if (productCode.equalsIgnoreCase("oracle")) {
          Software mySoftware = new Software();
            mySoftware.setCode(productCode);
            mySoftware.setDescription("Latest MySQL");
            mySoftware.setPrice(54.50);
            mySoftware.setVersion("Oracle 3.0");
            p = mySoftware;
        }

          if (productCode.equalsIgnoreCase("Rock")) {
            Music myMusic = new Music();
              myMusic.setCode(productCode);
              myMusic.setPrice(0.99);
              myMusic.setDescription("Highway to Hell");
              myMusic.setArtist("ACDC");
              p = myMusic;
          } else if (productCode.equalsIgnoreCase("Pop")) {
              Music myMusic = new Music();
              myMusic.setCode(productCode);
              myMusic.setDescription("Baby");
              myMusic.setPrice(0.01);
              myMusic.setArtist("Justin Bieber");
              p = myMusic;
          } else if (productCode.equalsIgnoreCase("Country")) {
             Music myMusic  = new Music();
              myMusic.setCode(productCode);
              myMusic.setDescription("Johnny Cash");
              myMusic.setPrice(0.99);
              myMusic.setArtist("Hurt");
              p = myMusic;
          }
          if (productCode.equalsIgnoreCase("Sony")) {
              Tv myTv = new Tv();
              myTv.setCode(productCode);
              myTv.setPrice(300);
              myTv.setDescription("Sony Bravia");
              myTv.setScreenSize("40");
              myTv.setManufactrure("Sony");
              p = myTv;

          } else if (productCode.equalsIgnoreCase("LG")) {
              Tv myTv = new Tv();
              myTv.setCode(productCode);
              myTv.setPrice(400);
              myTv.setDescription("LG OLED");
              myTv.setScreenSize("55");
              myTv.setManufactrure("LG");
              p = myTv;

          } else if (productCode.equalsIgnoreCase("Sky")) {
              Tv myTv = new Tv();
              myTv.setCode(productCode);
              myTv.setPrice(500);
              myTv.setDescription("Sky Glass");
              myTv.setScreenSize("60");
              myTv.setManufactrure("Sky");
              p = myTv;
          }
        return p;
    //We need all the book and software objects, we return p.
    }
}

