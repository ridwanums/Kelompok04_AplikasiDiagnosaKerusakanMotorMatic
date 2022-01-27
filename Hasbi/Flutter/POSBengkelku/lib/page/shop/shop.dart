import 'package:flutter/cupertino.dart';
import 'package:flutter/material.dart';
import 'package:posbengkelku/menu/menu_shop.dart';

class ShopPage extends StatefulWidget {
  const ShopPage({Key? key}) : super(key: key);

  @override
  _ShopPageState createState() => _ShopPageState();
}

class _ShopPageState extends State<ShopPage> {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      backgroundColor: Colors.white,
      appBar: AppBar(
        toolbarHeight: 80,
        backgroundColor: Colors.orange,
        automaticallyImplyLeading: false,
        title: Row(
          mainAxisAlignment: MainAxisAlignment.spaceBetween,
          children: [
            Text("Bengkel-ku", style: TextStyle(fontSize: 20)),
            Container(
              child: Row(
                children: [
                  CircleAvatar(
                    child: Image.asset("asset/images/ellipse.png"),
                    radius: 15,
                  ),
                  SizedBox(width: 10),
                  Text("Name user", style: TextStyle(fontSize: 16)),
                  SizedBox(width: 20),
                  Icon(Icons.arrow_drop_down, size: 35)
                ],
              ),
            )
          ],
        ),
      ),

      body: Container(
        child: Row(
          children: [
            Expanded(
              flex: 2,
              child: Container(
                child: MenuShop(),
              )
            ),

            VerticalDivider(width: 10, color: Colors.grey),

            Expanded(
                flex: 5,
                child: Container(
                  child: Column(
                    children: [
                      Expanded(
                        flex: 1,
                        child: Container(
                          padding: EdgeInsets.only(left: 20, right: 20),
                          child: Row(
                            mainAxisAlignment: MainAxisAlignment.spaceBetween,
                            children: [
                              Text("Customer", style: TextStyle(fontSize: 20, fontWeight: FontWeight.bold)),
                              Container(
                                padding: EdgeInsets.all(5),
                                height: 40,
                                width: 250,
                                color: Colors.grey[200],
                                child: Row(
                                  children: [
                                    Icon(Icons.search, color: Colors.grey),
                                    SizedBox(width: 5),
                                    Text("Search", style: TextStyle(color: Colors.grey))
                                  ],
                                ),
                              )
                            ],
                          ),
                        )
                      ),

                      Divider(height: 10, color: Colors.grey),

                      Expanded(
                          flex: 9,
                          child: Container(
                            child: ListView(
                              children: [
                                for (int i = 0; i < 5; i++)
                                  GestureDetector(
                                    child: Container(
                                      margin: EdgeInsets.only(top: 20),
                                      padding: EdgeInsets.only(left: 20, right: 20),
                                      child: Row(
                                        mainAxisAlignment: MainAxisAlignment.spaceBetween,
                                        children: [
                                          Container(
                                            width: 250,
                                            child: Row(
                                              children: [
                                                CircleAvatar(
                                                  child: Image.asset("asset/images/ellipse.png"),
                                                  radius: 15,
                                                ),
                                                SizedBox(width: 10),
                                                Text("Name Customer"),
                                                SizedBox(width: 50),
                                                Text("car"),
                                              ],
                                            ),
                                          ),

                                          Text("ID123456")
                                        ],
                                      ),
                                    ),
                                  )
                              ],
                            ),
                          )
                      ),
                    ],
                  ),
                )
            ),

            VerticalDivider(width: 10, color: Colors.grey),

            Expanded(
                flex: 3,
                child: Container(
                  child: Column(
                    children: [
                      Expanded(
                        flex: 9,
                        child: Container(
                          child: Column(
                            children: [
                              Container(
                                margin: EdgeInsets.only(top: 20, left: 20),
                                alignment: Alignment.topLeft,
                                child: Text("Owner", style: TextStyle(fontSize: 20, fontWeight: FontWeight.bold)),
                              ),

                              Container(
                                margin: EdgeInsets.only(top: 20, left: 20),
                                alignment: Alignment.topLeft,
                                child: CircleAvatar(
                                  child: Image.asset("asset/images/ellipse.png"),
                                ),
                              ),

                              Container(
                                margin: EdgeInsets.only(top: 20, left: 20),
                                alignment: Alignment.topLeft,
                                child: Text("Name", style: TextStyle(fontSize: 16, color: Colors.grey)),
                              ),

                              Container(
                                margin: EdgeInsets.only(top: 10, left: 20),
                                alignment: Alignment.topLeft,
                                child: Text("Name customer", style: TextStyle(fontSize: 16,)),
                              ),

                              Container(
                                margin: EdgeInsets.only(top: 30, left: 20),
                                alignment: Alignment.topLeft,
                                child: Text("Email", style: TextStyle(fontSize: 16, color: Colors.grey)),
                              ),

                              Container(
                                margin: EdgeInsets.only(top: 10, left: 20),
                                alignment: Alignment.topLeft,
                                child: Text("Name_customer@yahoo.com", style: TextStyle(fontSize: 16,)),
                              ),


                              Container(
                                margin: EdgeInsets.only(top: 30, left: 20),
                                alignment: Alignment.topLeft,
                                child: Text("Phone", style: TextStyle(fontSize: 16, color: Colors.grey)),
                              ),

                              Container(
                                margin: EdgeInsets.only(top: 10, left: 20),
                                alignment: Alignment.topLeft,
                                child: Text("08712345678", style: TextStyle(fontSize: 16,)),
                              ),

                              Container(
                                margin: EdgeInsets.only(top: 30, left: 20),
                                alignment: Alignment.topLeft,
                                child: Text("Address", style: TextStyle(fontSize: 16, color: Colors.grey)),
                              ),

                              Container(
                                margin: EdgeInsets.only(top: 10, left: 20),
                                alignment: Alignment.topLeft,
                                child: Text("Permuahan griya mandala, jalan kehormatan block A No. 19 Tangerang selatan", style: TextStyle(fontSize: 16,)),
                              ),
                            ],
                          ),
                        )
                      ),

                      Divider(height: 10, color: Colors.grey),

                      Expanded(
                        flex: 1,
                        child: Container(
                          margin: EdgeInsets.only(left: 20, right: 20),
                          child: Row(
                            mainAxisAlignment: MainAxisAlignment.spaceBetween,
                            children: [
                              Container(),
                              GestureDetector(
                                child: Container(
                                  height: 40,
                                  width: 120,
                                  decoration: BoxDecoration(
                                      color: Colors.orange
                                  ),
                                  child: Center(
                                    child: Text("Select Customer", style: TextStyle(color: Colors.white)),
                                  ),
                                ),
                              )
                            ],
                          ),
                        )
                      )
                    ],
                  ),
                )
            )
          ],
        ),
      ),
    );
  }
}
