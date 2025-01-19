package data;

import java.util.ArrayList;
import utils.Inputter;

public class FruitShopManagerment {

    ArrayList<Product> fruitList = new ArrayList<>();

    public void initData() {
        fruitList.add(new Product("001", "Apple", 5, "VN") {
        });

    }

    public void showProductList() {
        if (fruitList.isEmpty()) {
            System.out.println("Nothing to print");
            return;
        }
        System.out.println("___PRODUCTLIST___");
        for (Product item : fruitList) {
            item.showInfor();
        }
    }

    public int searchPetIndexById(String keyId) {
        for (int i = 0; i <= fruitList.size() - 1; i++) {
            if (fruitList.get(i).getId().equals(keyId)) {
                return i;
            }
        }
        return -1;
    }

    public Product searchPetById(String keyId) {
        int pos = searchPetIndexById(keyId); //Tìm vị trí trước nè
        return pos == -1 ? null : fruitList.get(pos); //vô ds lấy con pet ở vị trí tìm dc
    }

    //addNewFruit()
    public void addNewFruit() {

        boolean isDup;
        String id;
        do {
            isDup = false;//tin em chưa bị trùng
            id = Inputter.getString("Input your Fruit's id",
                    "This isn't matched XXX!"
            ).toUpperCase();

            Product product = searchPetById(id);//tìm con pet nào có mã đó ko

            if (product != null) {
                isDup = true;
                System.out.println("This id has been used!");
            }
        } while (isDup);

        String Name = Inputter.getString("Input Name:",
                "That filed is required!");
        int Quanlity = Inputter.getAnInteger("Input Quanlity", "That filed is required!");
        String Origin = Inputter.getString("Input Orgin", "That filed is required!");
        //bỏ vào cái phễu đầy đủ để tạo luôn
        Product fruit = new Product("002", "Mangpo", 5, "VietNam") {
        };

        //tạo xong thù lưu vào ds
        fruitList.add(fruit);
        System.out.println("Adding is successful!!!");
    }

}
