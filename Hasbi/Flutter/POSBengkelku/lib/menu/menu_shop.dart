import 'package:flutter/cupertino.dart';
import 'package:flutter/material.dart';
import 'package:posbengkelku/page/customer/customer.dart';
import 'package:posbengkelku/page/payment/payemet.dart';
import 'package:posbengkelku/page/product/product.dart';
import 'package:posbengkelku/page/report/report.dart';
import 'package:posbengkelku/page/service/service_reservation.dart';
import 'package:posbengkelku/page/setting/setting.dart';
import 'package:posbengkelku/page/shop/shop.dart';

class MenuShop extends StatefulWidget {
  const MenuShop({Key? key}) : super(key: key);

  @override
  _MenuShopState createState() => _MenuShopState();
}

class _MenuShopState extends State<MenuShop> {
  @override
  Widget build(BuildContext context) {
    return Container(
      color: Colors.white,
      child: Column(
        children: [
          Container(
            margin: EdgeInsets.only(top: 30, left: 30, bottom: 20),
            alignment: Alignment.topLeft,
            child: Text("MENU", style: TextStyle(fontSize: 16, color: Colors.grey, fontWeight: FontWeight.bold)),
          ),

          GestureDetector(
            child: Container(
              child: Image.asset("asset/images/menu/unselect_service.png"),
            ),
            onTap: (){
              Navigator.push(context, MaterialPageRoute(builder: (context) => ServiceReservationPage()));
            },
          ),
          
          GestureDetector(
            child: Container(
              margin: EdgeInsets.only(top: 10),
              child: Image.asset("asset/images/menu/select_shop.png"),
            ),
            onTap: (){
              // Navigator.push(context, MaterialPageRoute(builder: (context) => ShopPage()));
            },
          ),

          GestureDetector(
            child: Container(
              margin: EdgeInsets.only(top: 10),
              child: Image.asset("asset/images/menu/unselect_payment.png"),
            ),
            onTap: (){
              Navigator.push(context, MaterialPageRoute(builder: (context) => PaymentPage()));
            },
          ),

          GestureDetector(
            child: Container(
              margin: EdgeInsets.only(top: 10),
              child: Image.asset("asset/images/menu/unselect_customer.png"),
            ),
            onTap: (){
              Navigator.push(context, MaterialPageRoute(builder: (context) => CustomerPage()));
            },
          ),

          GestureDetector(
            child: Container(
              margin: EdgeInsets.only(top: 10),
              child: Image.asset("asset/images/menu/unselect_product.png"),
            ),
            onTap: (){
              Navigator.push(context, MaterialPageRoute(builder: (context) => ProductStoctPage()));
            },
          ),

          GestureDetector(
            child: Container(
              margin: EdgeInsets.only(top: 10),
              child: Image.asset("asset/images/menu/unselect_report.png"),
            ),
            onTap: (){
              Navigator.push(context, MaterialPageRoute(builder: (context) => ReportHistoryPage()));
            },
          ),

          Container(
            margin: EdgeInsets.only(top: 20, left: 30, bottom: 20),
            alignment: Alignment.topLeft,
            child: Text("OTHER", style: TextStyle(fontSize: 16, color: Colors.grey, fontWeight: FontWeight.bold)),
          ),

          GestureDetector(
            child: Container(
              margin: EdgeInsets.only(top: 10),
              child: Image.asset("asset/images/menu/unselect_setting.png"),
            ),
            onTap: (){
              Navigator.push(context, MaterialPageRoute(builder: (context) => SettingPage()));
            },
          ),

          GestureDetector(
            child: Container(
              margin: EdgeInsets.only(top: 10),
              child: Image.asset("asset/images/menu/logout.png"),
            ),
            onTap: (){
              Navigator.push(context, MaterialPageRoute(builder: (context) => ReportHistoryPage()));
            },
          ),
        ],
      ),
    );
  }
}
