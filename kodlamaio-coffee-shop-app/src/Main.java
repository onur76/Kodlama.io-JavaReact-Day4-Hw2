import java.time.LocalDate;

import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		
		BaseCustomerManager customerNero = new NeroCustomerManager(new MernisServiceAdapter());
		customerNero.Save(new Customer(1, "MustBeRealName", "MustBeRealSurname", LocalDate.of(2012, 12, 12), "MustBeRealNationalId"));
		
		//Gerçek bir kişinin bilgilerini girerek kontrol edebilirsiniz.
		//Doğrulamada sadece doğum yılı esas alındığı için Ay ve Gün bilgisi YANLIŞ girilse bile kişi doğrulanacaktır!

		BaseCustomerManager customerStarbucks = new StarbucksCustomerManager(new MernisServiceAdapter());
		customerStarbucks.Save(new Customer(2, "MustBeRealName", "MustBeRealSurname", LocalDate.of(2012, 12, 12), "MustBeRealNationalId"));
		
		//Gerçek bir kişinin bilgilerini girerek kontrol edebilirsiniz.
		//Doğrulamada sadece doğum yılı esas alındığı için Ay ve Gün bilgisi YANLIŞ girilse bile kişi doğrulanacaktır!
	}

}
