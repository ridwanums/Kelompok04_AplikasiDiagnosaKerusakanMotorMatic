import 'dart:ffi';

import 'package:expandable/expandable.dart';
import 'package:flutter/cupertino.dart';
import 'package:flutter/material.dart';
import 'package:posbengkelku/dialog/order.dart';
import 'package:posbengkelku/main.dart';
import 'package:posbengkelku/page/edit.dart';
import 'package:posbengkelku/page/service/new_reservation.dart';
import 'package:posbengkelku/page/shop/shop.dart';


class ServicePage extends StatefulWidget {

  @override
  _ServicePageState createState() => _ServicePageState();
}

class _ServicePageState extends State<ServicePage> {


  _displayDialog(BuildContext context) async {
    return showDialog(
        context: context,
        builder: (context) {
          return AlertDialog(
            title: Container(
              child: Column(
                children: [
                  Image.asset("asset/images/quetion.png", height: 50,),
                  SizedBox(height: 50),
                  Container(
                    child: Row(
                      children: [
                        Text("Are you sure want to change reservation", style: TextStyle(color: Colors.grey[400])),
                        SizedBox(width: 5,),
                        Text("R#9819231", style: TextStyle(color: Colors.black)),
                        SizedBox(width: 5,),
                        Text("to order ?", style: TextStyle(color: Colors.grey[400])),
                      ],
                    ),
                  ),
                  SizedBox(height: 20),
                  Divider(height: 1, color: Colors.grey)
                ],
              ),
            ),
            content: Container(
              height: 200,
              child: Column(
                children: [
                  Container(
                    padding: EdgeInsets.all(10),
                    height: 50,
                    color: Colors.grey[100],
                    child: Row(
                      children: [
                        Text("R#9819231", style: TextStyle(color: Colors.black)),
                        SizedBox(width: 20,),
                        Text("Owner name", style: TextStyle(color: Colors.grey[500])),
                        SizedBox(width: 5,),
                        Text("-", style: TextStyle(color: Colors.grey[500])),
                        SizedBox(width:5,),
                        Text("Car name", style: TextStyle(color: Colors.grey[500])),
                      ],
                    ),
                  ),
                ],
              ),
            ),
            actions: [
              Row(
                mainAxisAlignment: MainAxisAlignment.end,
                children: [
                  GestureDetector(
                    child: Container(
                      height: 40,
                      width: 140,
                      decoration: BoxDecoration(
                          color: Colors.white,
                          border: Border.all(color: Colors.grey)
                      ),
                      child: Align(
                        alignment: Alignment.center,
                        child: Text("Cancel", style: TextStyle(color: Colors.grey),),
                      ),
                    ),
                    onTap: (){
                      Navigator.pop(context);
                    },
                  ),

                  SizedBox( width: 10,),

                  GestureDetector(
                    child: Container(
                      height: 40,
                      width: 140,
                      color: Colors.orange,
                      child: Align(
                        alignment: Alignment.center,
                        child: Text("Done", style: TextStyle(color: Colors.white),),
                      ),
                    ),
                    onTap: (){
                      Navigator.pop(context);
                    },
                  )
                ],
              )
            ],
          );
        });
  }


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
      body: Container(
        child: Stack(
          children: [
            Column(
              children: [
                Container(
                  height: MediaQuery.of(context).size.height * 0.12,
                  decoration: BoxDecoration(
                    color: Colors.white,
                    border: Border(
                      bottom: BorderSide(
                        color: Colors.grey,
                        width: 1
                      )
                    )
                  ),
                  child: Row(
                    mainAxisAlignment: MainAxisAlignment.spaceBetween,
                    children: [
                      Container(
                        margin: EdgeInsets.only(left: 30),
                        child: Row(
                          children: [
                            Text("Reservation", style: TextStyle(fontSize: 20, color: Colors.orange, fontWeight: FontWeight.bold)),
                            Container(
                              margin: EdgeInsets.only(left: 5),
                              height: 20,
                              width: 20,
                              decoration: BoxDecoration(
                                color: Colors.grey[300],
                                borderRadius: BorderRadius.circular(6)
                              ),
                              child: Align(
                                alignment: Alignment.center,
                                child: Text("5"),
                              )
                            ),
                            SizedBox(
                              width: 20,
                            ),
                            Text("Order", style: TextStyle(fontSize: 20, color: Colors.black, fontWeight: FontWeight.bold)),
                            Container(
                                margin: EdgeInsets.only(left: 5),
                                height: 20,
                                width: 20,
                                decoration: BoxDecoration(
                                    color: Colors.grey[300],
                                    borderRadius: BorderRadius.circular(6)
                                ),
                                child: Align(
                                  alignment: Alignment.center,
                                  child: Text("1"),
                                )
                            ),
                          ],
                        ),
                      ),

                      Container(
                        margin: EdgeInsets.only(right: 30),
                        child: Row(
                          children: [
                            GestureDetector(
                              onTap: (){
                                _selectDate(context);
                              },
                              child: Container(
                                padding: EdgeInsets.all(5),
                                height: 40,
                                width: 120,
                                decoration: BoxDecoration(
                                    border: Border.all(color: Colors.grey)
                                ),
                                child: Row(
                                  mainAxisAlignment: MainAxisAlignment.spaceBetween,
                                  children: [
                                    Text("${selectedDate.toLocal()}".split(' ')[0]),
                                    Icon(Icons.calendar_today)
                                  ],
                                ),
                              )
                            ),

                            SizedBox(
                              width: 20,
                            ),

                            GestureDetector(
                              child: Container(
                                padding: EdgeInsets.all(7),
                                height: 40,
                                width: 120,
                                decoration: BoxDecoration(
                                  color: Colors.lightBlueAccent[200],
                                  border: Border.all(color: Colors.grey),
                                ),
                                child: Row(
                                  mainAxisAlignment: MainAxisAlignment.center,
                                  children: [
                                    Icon(Icons.add, color: Colors.orange,),
                                    SizedBox(width: 5,),
                                    Text("Add new", style: TextStyle(color: Colors.orange),),
                                  ],
                                ),
                              ),
                              onTap: (){
                                Navigator.push(
                                  context,
                                  MaterialPageRoute(builder: (context) => NewReservationPage()),
                                );
                              },
                            )
                          ],
                        ),
                      )
                    ],
                  ),
                ),


                Container(
                  width: MediaQuery.of(context).size.width,
                  height: MediaQuery.of(context).size.height * 0.77,
                  color: Colors.white,
                  child: ListView(
                    children: [
                      for(int i=0; i<=10; i++)
                        buildCard()
                    ],
                  ),
                )
              ]
            )
          ]
        )
      )
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
                            MaterialPageRoute(builder: (context) => EditPage()),
                          );
                        } else if (result == 1) {
                          _displayDialog(context);
                        }
                      },

                      itemBuilder: (context) => [
                        PopupMenuItem(
                          value: 0,
                          child: Row(
                            children: [
                              Icon(Icons.edit),
                              SizedBox(width: 10),
                              Text("Edit"),
                            ],
                          ),
                        ),

                        PopupMenuItem(
                          value: 1,
                          child: Row(
                            children: [
                              Icon(Icons.cancel_outlined),
                              SizedBox(width: 10),
                              Text("Cancel")
                            ],
                          ),
                        ),

                        PopupMenuItem(
                          value: 3,
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

                  Align(
                    alignment: Alignment.centerRight,
                    child: GestureDetector(
                      child: Container(
                        margin: EdgeInsets.only(right: 30),
                        height: 40,
                        width: 100,
                        decoration: BoxDecoration(
                            color: Colors.orange,
                            borderRadius: BorderRadius.circular(5)
                        ),
                        child: Center(
                          child: Text("Order", style: TextStyle(color: Colors.white),),
                        ),
                      ),
                      onTap: (){
                        showDialog(context: context, builder: (context){
                        return DialogOrder();
                        });
                        Navigator.push(context, MaterialPageRoute(builder: (context) => ShopePage()));
                      },
                    )
                  )
                ],
              ),
            )
          ),
        ),
      );
}


