import 'package:expandable/expandable.dart';
import 'package:flutter/cupertino.dart';
import 'package:flutter/material.dart';
import 'package:flutter/rendering.dart';
import 'package:posbengkelku/dialog/dialog_service_expanded.dart';
import 'package:posbengkelku/menu/menu_service.dart';
import 'package:posbengkelku/page/payment/payemet.dart';
import 'package:posbengkelku/page/service/service_edit.dart';

class ServiceOrder extends StatefulWidget {
  const ServiceOrder({Key? key}) : super(key: key);

  @override
  _ServiceOrderState createState() => _ServiceOrderState();
}

class _ServiceOrderState extends State<ServiceOrder> {

  DateTime selectedDate = DateTime.now();
  Future<Null> _selectDate(BuildContext context) async {
    final DateTime? picked = await showDatePicker(
        context: context,
        initialDate: selectedDate,
        firstDate: DateTime(2015, 8),
        lastDate: DateTime(2101));
    if (picked != null && picked != selectedDate)
      setState(() {
        selectedDate = picked;
      });
  }

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
                child: MenuService(),
              )
            ),

            VerticalDivider(width: 10, color: Colors.grey),

            Expanded(
                flex: 8,
                child: Container(
                  child: Column(
                    children: [
                      Expanded(
                        flex: 1,
                        child: Container(
                          child: Row(
                            mainAxisAlignment: MainAxisAlignment.spaceBetween,
                            children: [
                              Container(
                                child: Row(
                                  children: [
                                    GestureDetector(
                                      child: Container(
                                        margin: EdgeInsets.only(left: 20),
                                        child: Text("Reservation", style: TextStyle(fontSize: 18, fontWeight: FontWeight.bold)),
                                      ),
                                      onTap: (){
                                        Navigator.pop(context);
                                      },
                                    ),

                                    Container(
                                      margin: EdgeInsets.only(left: 5),
                                      height: 20,
                                      width: 20,
                                      decoration: BoxDecoration(
                                        color: Colors.grey[200],
                                        borderRadius: BorderRadius.circular(5)
                                      ),
                                      child: Center(
                                        child: Text("5"),
                                      ),
                                    ),

                                    GestureDetector(
                                      child: Container(
                                        margin: EdgeInsets.only(left: 20),
                                        child: Text("Order", style: TextStyle(fontSize: 18, fontWeight: FontWeight.bold, color: Colors.orange)),
                                      ),
                                    ),

                                    Container(
                                      margin: EdgeInsets.only(left: 5),
                                      height: 20,
                                      width: 20,
                                      decoration: BoxDecoration(
                                          color: Colors.grey[200],
                                          borderRadius: BorderRadius.circular(5)
                                      ),
                                      child: Center(
                                        child: Text("2"),
                                      ),
                                    ),
                                  ],
                                ),
                              ),

                              Container(
                                margin: EdgeInsets.only(right: 30),
                                child: Row(
                                  children: [
                                    GestureDetector(
                                      child: Container(
                                        margin: EdgeInsets.only(right: 20),
                                        padding: EdgeInsets.all(5),
                                        height: 40,
                                        width: 110,
                                        decoration: BoxDecoration(
                                            color: Colors.white,
                                            border: Border.all(color: Colors.grey, width: 1),
                                            borderRadius: BorderRadius.circular(3)
                                        ),
                                        child: Center(
                                            child: Row(
                                              children: [
                                                Text("${selectedDate.toLocal()}".split(' ')[0]),
                                                SizedBox(
                                                  width: 5,
                                                ),
                                                Icon(Icons.calendar_today,size: 20)
                                              ],
                                            )
                                        ),
                                      ),
                                      onTap: (){
                                        _selectDate(context);
                                      },
                                    ),

                                    GestureDetector(
                                      child: Container(
                                          height: 40,
                                          width: 110,
                                          padding: EdgeInsets.all(5),
                                          decoration: BoxDecoration(
                                              color: Colors.blueGrey[100],
                                              border: Border.all(color: Colors.grey, width: 1),
                                              borderRadius: BorderRadius.circular(3)
                                          ),
                                          child: Row(
                                            mainAxisAlignment: MainAxisAlignment.center,
                                            children: [
                                              Icon(Icons.add, size: 20),
                                              SizedBox(width: 5),
                                              Text("add new")
                                            ],
                                          )
                                      ),
                                    )
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
                                buildCard()
                              ],
                            ),
                          )
                      ),
                    ],
                  ),
                )
            )
          ],
        ),
      ),
    );
  }

  buildCard() =>
      Padding(
        padding: EdgeInsets.only(top: 10, bottom: 10, right: 20, left: 20),
        child: Card(
          color: Colors.grey[100],
          child: ExpandablePanel(
              hasIcon: false,
              header: Container(
                padding: EdgeInsets.only(left: 20, right: 20, top: 10, bottom: 10),
                child: Row(
                  mainAxisAlignment: MainAxisAlignment.spaceBetween,
                  children: [
                    Container(
                      child: Row(
                        children: [
                          Text("R#9819231", style: TextStyle(fontSize: 18),),
                          SizedBox(
                            width: 10,
                          ),
                          Text("Owner name", style: TextStyle(color: Colors.grey[500], fontSize: 18)),
                          SizedBox(
                            width: 5,
                          ),
                          Text("-", style: TextStyle(color: Colors.grey[500], fontSize: 18)),
                          SizedBox(
                            width: 5,
                          ),
                          Text("Car name", style: TextStyle(color: Colors.grey[500], fontSize: 18)),
                        ],
                      ),
                    ),

                    PopupMenuButton(
                        offset: Offset(-35, -5),
                        onSelected: (result) {
                          if (result == 0) {
                            Navigator.push(
                              context,
                              MaterialPageRoute(builder: (context) => ServiceEditPage()),
                            );
                          } else if (result == 1) {
                            showDialog(context: context, builder: (context){
                              return DialogExpanded();
                            });
                          }
                        },

                        itemBuilder: (context) => [
                          PopupMenuItem(
                            value: 1,
                            child: Row(
                              children: [
                                Icon(Icons.delete),
                                SizedBox(width: 10),
                                Text("Delete")
                              ],
                            ),
                          ),
                        ]
                    )
                  ],
                ),
              ),
              // collapsed: Text(
              //   lorem,
              //   style: TextStyle(fontSize: 18),
              // ),
              expanded: Container(
                padding: EdgeInsets.only(left: 50, bottom: 10),
                child: Column(
                  children: [
                    Container(
                      child: Row(
                        children: [
                          Text("General Checking", style: TextStyle(fontSize: 16)),
                          SizedBox(
                            width: 200,
                          ),
                          Text("500.000", style: TextStyle(fontSize: 16)),
                          Container(
                              margin: EdgeInsets.only(left: 10),
                              height: 20,
                              width: 20,
                              decoration: BoxDecoration(
                                  color: Colors.grey[300],
                                  borderRadius: BorderRadius.circular(6)
                              ),
                              child: Align(
                                alignment: Alignment.center,
                                child: Icon(Icons.close, color: Colors.grey, size: 15,),
                              )
                          ),
                        ],
                      ),
                    ),

                    SizedBox(
                      height: 40,
                    ),

                    Container(
                      child: Row(
                        children: [
                          Text("Service name", style: TextStyle(fontSize: 16)),
                          SizedBox(
                            width: 230,
                          ),
                          Text("500.000", style: TextStyle(fontSize: 16)),
                          Container(
                              margin: EdgeInsets.only(left: 10),
                              height: 20,
                              width: 20,
                              decoration: BoxDecoration(
                                  color: Colors.orange,
                                  borderRadius: BorderRadius.circular(6)
                              ),
                              child: Align(
                                alignment: Alignment.center,
                                child: Icon(Icons.close, color: Colors.white, size: 15,),
                              )
                          ),
                        ],
                      ),
                    ),

                    SizedBox(
                      height: 40,
                    ),

                    Container(
                        width: MediaQuery.of(context).size.width,
                        margin: EdgeInsets.only(right: 30),
                        child: Row(
                          mainAxisAlignment: MainAxisAlignment.end,
                          children: [
                            GestureDetector(
                              child: Container(
                              height: 40,
                                width: 120,
                                decoration: BoxDecoration(
                                  color: Colors.white,
                                  border: Border.all(color: Colors.grey)
                                ),
                                child: Row(
                                  mainAxisAlignment: MainAxisAlignment.center,
                                  children: [
                                    Text("Work order"),
                                    SizedBox(width: 5,),
                                    Icon(Icons.print)
                                  ],
                                ),
                              ),
                            ),

                            SizedBox(width: 10),

                            GestureDetector(
                              child: Container(
                                height: 40,
                                width: 120,
                                decoration: BoxDecoration(
                                    color: Colors.orange
                                ),
                                child: Center(
                                  child: Text("Payment", style: TextStyle(color: Colors.white)),
                                ),
                              ),
                              onTap: (){
                                Navigator.push(context, MaterialPageRoute(builder: (context) => PaymentPage()));
                              },
                            )
                          ],
                        ),
                    )
                  ],
                ),
              )
          ),
        ),
      );
}

