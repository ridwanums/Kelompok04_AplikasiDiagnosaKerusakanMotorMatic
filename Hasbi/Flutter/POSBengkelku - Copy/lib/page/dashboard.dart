
import 'package:flutter/cupertino.dart';
import 'package:flutter/material.dart';
import 'package:posbengkelku/page/customer.dart';
import 'package:posbengkelku/page/payment.dart';
import 'package:posbengkelku/page/product.dart';
import 'package:posbengkelku/page/report.dart';
import 'package:posbengkelku/page/service/service.dart';
import 'package:posbengkelku/page/setting.dart';
import 'package:posbengkelku/page/shop/shop.dart';

class DashboardPage extends StatefulWidget {
  const DashboardPage({Key? key}) : super(key: key);

  @override
  _DashboardPageState createState() => _DashboardPageState();
}

class _DashboardPageState extends State<DashboardPage> {

   int _index = 0;
   final scree = [
     ServicePage(),
     ShopePage(),
     PaymentPage(),
     CustomerPage(),
     ProductAndStockPage(),
     ReportHistoryPage(),
     SettingPage(),
     Text("data")
   ];
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        toolbarHeight: 80,
        automaticallyImplyLeading: false,
        backgroundColor: Colors.orange,
        title: Row(
          mainAxisAlignment: MainAxisAlignment.spaceBetween,
          children: [
            Text("Bengkel-ku", style: TextStyle(fontSize: 20, fontWeight: FontWeight.bold)),
            Container(
              child: Row(
                children: [
                  Container(
                    height: 40,
                    width: 40,
                    decoration: BoxDecoration(
                      color: Colors.white,
                      borderRadius: BorderRadius.circular(50)
                    ),
                    child: Image.asset("asset/images/ellipse.png"),
                  ),

                  Container(
                    margin: EdgeInsets.only(left: 10, right: 20),
                    child: Text("User", style: TextStyle(fontSize: 16),),
                  ),
                  
                  Icon(Icons.arrow_drop_down, size: 35)
                ],
              ),
            )
          ],
        ),
      ),

      body: Row(
        children: [
          Expanded(
            flex: 2,
            child: Container(
              color: Colors.white,
              child: Stack(
                children: [
                  Container(
                    margin: EdgeInsets.only(left: 30, top: 50),
                    child: Align(
                      alignment: Alignment.topLeft,
                      child: Text("MENU", style: TextStyle(fontSize: 18, color: Colors.grey[400], fontWeight: FontWeight.bold)),
                    )
                  ),

                  Container(
                    margin: EdgeInsets.only(top: 70),
                    child: NavigationRail(
                      selectedIndex: _index,
                      extended: true,
                      selectedLabelTextStyle: TextStyle(color: Colors.orange, fontSize: 16),
                      unselectedLabelTextStyle: TextStyle(fontSize: 16),
                      onDestinationSelected: (int index){
                        setState(() {
                          _index = index;
                        });
                      },
                      labelType: NavigationRailLabelType.none,
                      destinations: [
                        NavigationRailDestination(
                          icon: Image.asset("asset/images/menu/unselected_service.png"),
                          selectedIcon: Image.asset("asset/images/menu/selected_service.png"),
                          label: Text('   Service'),
                        ),
                        NavigationRailDestination(
                          icon: Image.asset("asset/images/menu/unselected_shop.png"),
                          selectedIcon: Image.asset("asset/images/menu/selected_shop.png"),
                          label: Text('   Shop'),
                        ),
                        NavigationRailDestination(
                          icon: Image.asset("asset/images/menu/unselected_payment.png"),
                          selectedIcon: Image.asset("asset/images/menu/selected_payment.png"),
                          label: Text('   Payment'),
                        ),
                        NavigationRailDestination(
                          icon: Image.asset("asset/images/menu/unselected_customer.png"),
                          selectedIcon: Image.asset("asset/images/menu/selected_customer.png"),
                          label: Text('   Customer'),
                        ),
                        NavigationRailDestination(
                          icon: Image.asset("asset/images/menu/unselected_product.png"),
                          selectedIcon: Image.asset("asset/images/menu/selected_product.png"),
                          label: Text('   Product & Stock'),
                        ),
                        NavigationRailDestination(
                          icon: Image.asset("asset/images/menu/unselected_report.png"),
                          selectedIcon: Image.asset("asset/images/menu/selected_report.png"),
                          label: Text('   Report History'),
                        ),



                        NavigationRailDestination(
                          icon: Image.asset("asset/images/menu/unselected_setting.png"),
                          selectedIcon: Image.asset("asset/images/menu/selected_setting.png"),
                          label: Text('   Setting'),
                        ),

                        NavigationRailDestination(
                          icon: Image.asset("asset/images/menu/logout.png"),
                          selectedIcon: Image.asset("asset/images/menu/logout.png"),
                          label: Text('   Logout'),
                        ),
                      ],
                    )
                  ),
                  
                  Container(
                    margin: EdgeInsets.only(top: 500, left: 30),
                    child: Text("OTHER", style: TextStyle(fontSize: 18, color: Colors.grey[400], fontWeight: FontWeight.bold)),
                  )
                ],
              ),
            )
          ),

          VerticalDivider(width: 3, color: Colors.grey),

          Expanded(
            flex: 8,
            child: Scaffold(
              body: scree[_index],
            )
          )
        ],
      ),
    );
  }
}