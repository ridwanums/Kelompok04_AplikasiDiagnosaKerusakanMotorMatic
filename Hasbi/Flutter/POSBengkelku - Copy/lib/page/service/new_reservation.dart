import 'package:expandable/expandable.dart';
import 'package:flutter/cupertino.dart';
import 'package:flutter/material.dart';

import 'new_reservation_mechanic.dart';

class NewReservationPage extends StatefulWidget {
  const NewReservationPage({Key? key}) : super(key: key);

  @override
  _NewReservationPageState createState() => _NewReservationPageState();
}

class _NewReservationPageState extends State<NewReservationPage> {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        backgroundColor: Colors.orange,
        toolbarHeight: MediaQuery.of(context).size.height * 0.11,
        title: Text("New Reservation"),
      ),

      body: Container(
        child: Row(
          children: [
            Expanded(
              flex: 7,
              child: Container(
                color: Colors.white,
                child: Column(
                  children: [
                    Expanded(
                      flex: 1,
                      child: Container(
                        height: 80,
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
                          children: [
                            Container(
                              margin: EdgeInsets.only(left: 20),
                              child: Text("Customer", style: TextStyle(fontSize: 18, fontWeight: FontWeight.bold)),
                            )
                          ],
                        ),
                      ),
                    ),

                    Expanded(
                      flex: 6,
                      child: Container(
                        color: Colors.white,
                        child: ListView(
                          children: [
                            for(int i=0; i < 10; i++)
                              buildCard()
                          ],
                        ),
                      ),
                    )
                  ],
                ),
              )
            ),

            VerticalDivider(
              width: 2,
              color: Colors.grey,
            ),

            Expanded(
              flex: 4,
              child: Scaffold(
                backgroundColor: Colors.white,
                body: Container(
                  child: Column(
                    children: [
                      Expanded(
                        flex: 9,
                        child: Container(
                          margin: EdgeInsets.only(left: 30, right: 30, top: 30),
                          child: Column(
                            children: [
                              Container(
                                child: Stack(
                                  children: [
                                    Container(
                                      margin: EdgeInsets.only(top: 10),
                                      alignment: Alignment.centerLeft,
                                      child: Text("Customer", style: TextStyle(fontSize: 16, color: Colors.grey)),
                                    ),
                                    Container(
                                      margin: EdgeInsets.only(top: 30),
                                      alignment: Alignment.centerLeft,
                                      child: Text("Name customer", style: TextStyle(fontSize: 16)),
                                    ),
                                    Container(
                                      height: 50,
                                      width: 250,
                                      padding: EdgeInsets.all(10),
                                      margin: EdgeInsets.only(left: 150),
                                      decoration: BoxDecoration(
                                        color: Colors.grey[100],
                                        borderRadius: BorderRadius.circular(5)
                                      ),
                                      child: Row(
                                        mainAxisAlignment: MainAxisAlignment.spaceBetween,
                                        children: [
                                          Text("Grand Livina", style: TextStyle(fontSize: 16)),
                                          Icon(Icons.keyboard_arrow_down)
                                        ],
                                      ),
                                    )
                                  ],
                                ),
                              ),

                              Container(
                                margin: EdgeInsets.only(top: 30),
                                child: Row(
                                  mainAxisAlignment: MainAxisAlignment.spaceBetween,
                                  children: [
                                    Container(
                                      child: Stack(
                                        children: [
                                          Container(
                                            alignment: Alignment.centerLeft,
                                            child: Text("Mechanic", style: TextStyle(color: Colors.grey, fontSize: 16)),
                                          ),
                                          Container(
                                            margin: EdgeInsets.only(top: 20),
                                            alignment: Alignment.centerLeft,
                                            child: Text("-", style: TextStyle(fontSize: 16)),
                                          ),
                                        ],
                                      ),
                                    ),

                                    Container(
                                      child: Stack(
                                        children: [
                                          Container(
                                            alignment: Alignment.centerLeft,
                                            child: Text("Date", style: TextStyle(color: Colors.grey, fontSize: 16)),
                                          ),
                                          Container(
                                            margin: EdgeInsets.only(top: 20),
                                            alignment: Alignment.centerLeft,
                                            child: Text("-", style: TextStyle(fontSize: 16)),
                                          ),
                                        ],
                                      ),
                                    ),

                                    Container(
                                      child: Stack(
                                        children: [
                                          Container(
                                            alignment: Alignment.centerLeft,
                                            child: Text("Time", style: TextStyle(color: Colors.grey, fontSize: 16)),
                                          ),
                                          Container(
                                            margin: EdgeInsets.only(top: 20),
                                            alignment: Alignment.centerLeft,
                                            child: Text("-", style: TextStyle(color: Colors.grey, fontSize: 16)),
                                          ),
                                        ],
                                      ),
                                    )
                                  ],
                                ),
                              ),

                              SizedBox(
                                height: 20,
                              ),

                              Divider(color: Colors.grey, height: 2,),

                              Container(
                                padding: EdgeInsets.only(top: 20, bottom: 20),
                                child: Row(
                                  mainAxisAlignment: MainAxisAlignment.spaceBetween,
                                  children: [
                                    Text("Complaint", style: TextStyle(fontSize: 18, fontWeight: FontWeight.bold)),
                                    GestureDetector(
                                      child: Container(
                                        padding: EdgeInsets.all(10),
                                        height: 40,
                                        decoration: BoxDecoration(
                                          color: Colors.cyan[100],
                                          borderRadius: BorderRadius.circular(5)
                                        ),
                                        child: Center(
                                          child: Text("Add Complaint", style: TextStyle(color: Colors.orange)),
                                        ),
                                      ),
                                    )
                                  ],
                                ),
                              ),

                              Divider(color: Colors.grey, height: 2,),

                              Container(
                                padding: EdgeInsets.only(top: 20, bottom: 20),
                                child: Row(
                                  mainAxisAlignment: MainAxisAlignment.spaceBetween,
                                  children: [
                                    Text("Service", style: TextStyle(fontSize: 18, fontWeight: FontWeight.bold)),
                                    GestureDetector(
                                      child: Container(
                                        padding: EdgeInsets.all(10),
                                        height: 40,
                                        decoration: BoxDecoration(
                                            color: Colors.cyan[100],
                                            borderRadius: BorderRadius.circular(5)
                                        ),
                                        child: Row(
                                          mainAxisAlignment: MainAxisAlignment.spaceBetween,
                                          children: [
                                            Icon(Icons.add, color: Colors.orange, size: 20,),
                                            Text("Add service", style: TextStyle(color: Colors.orange)),
                                          ],
                                        ),
                                      ),
                                    )
                                  ],
                                ),
                              ),

                              Container(
                                child: Row(
                                  mainAxisAlignment: MainAxisAlignment.spaceBetween,
                                  children: [
                                    Text("Service Selected", style: TextStyle(color: Colors.grey)),
                                    Container(
                                      margin: EdgeInsets.only(right: 90),
                                      child: Text("Price", style: TextStyle(color: Colors.grey)),
                                    ),
                                  ],
                                ),
                              ),

                              Container(
                                height: MediaQuery.of(context).size.height * 0.33,
                                child: ListView(
                                  children: [
                                    Container(
                                      margin: EdgeInsets.only(top: 20),
                                      padding: EdgeInsets.all(10),
                                      height: 40,
                                      width: MediaQuery.of(context).size.width,
                                      decoration: BoxDecoration(
                                        color: Colors.grey[200]
                                      ),
                                      child: Row(
                                        mainAxisAlignment: MainAxisAlignment.spaceBetween,
                                        children: [
                                          Text("General Checking"),
                                          Container(
                                            child: Row(
                                              children: [
                                                Text("500.000", style: TextStyle(color: Colors.grey)),
                                                SizedBox(
                                                  width: 50,
                                                ),
                                                Container(
                                                  height: 20,
                                                  width: 20,
                                                  decoration: BoxDecoration(
                                                    color: Colors.grey[300],
                                                    borderRadius: BorderRadius.circular(3)
                                                  ),
                                                  child: Icon(Icons.close, size: 15, color: Colors.white,),
                                                )
                                              ],
                                            ),
                                          )
                                        ],
                                      ),
                                    ),
                                  ],
                                ),
                              )
                            ],
                          ),
                        )
                      ),

                      Divider(color: Colors.grey, height: 2,),

                      Expanded(
                        flex: 1,
                        child: Container(
                          margin: EdgeInsets.only(right: 30),
                          child: Stack(
                            children: [
                              Align(
                                alignment: Alignment.centerRight,
                                child: GestureDetector(
                                  child: Container(
                                    height: 40,
                                    width: 100,
                                    decoration: BoxDecoration(
                                      color:  Colors.grey,
                                      borderRadius: BorderRadius.circular(5)
                                    ),
                                    child: Center(
                                      child: Text("Reserve", style: TextStyle(color: Colors.grey[200])),
                                    )
                                  ),
                                ),
                              )
                            ],
                          ),
                        ),
                      )
                    ],
                  ),
                ),
              ),
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
              padding: EdgeInsets.all(20),
              child: Row(
                mainAxisAlignment: MainAxisAlignment.spaceBetween,
                children: [
                  Container(
                    child: Row(
                      children: [
                        CircleAvatar(
                          radius: 15,
                          child: Image.asset(
                            "asset/images/ellipse.png"
                          )
                        ),
                        SizedBox(width: 10),
                        Container(
                          width: 120,
                         child: Text("Name Customer")
                        ),
                        Container(
                          margin: EdgeInsets.only(left: 25),
                          child: Text("1 Car")
                        )
                      ],
                    ),
                  ),

                  Text("ID12345678")
                ],
              ),
            ),

            expanded: Container(
              padding: EdgeInsets.only(right: 20, left: 20, top: 10, bottom: 10),
              child: Column(
                children: [
                  Row(
                    mainAxisAlignment: MainAxisAlignment.spaceBetween,
                    children: [
                      Text("Grand Livina"),
                      Row(
                        children: [
                          Text("Black")
                        ],
                      ),

                      Row(
                        children: [
                          Text("B 1234 XYZ")
                        ],
                      ),

                      Row(
                        children: [
                          Text("2018")
                        ],
                      ),

                      Row(
                        children: [
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
                                child: Icon(Icons.check, color: Colors.white, size: 15,),
                              )
                          ),
                        ],
                      ),
                    ],
                  ),

                  SizedBox(
                    height: 30,
                  ),

                  Align(
                    alignment: Alignment.centerRight,
                    child: GestureDetector(
                      child: Container(
                        height: 40,
                        width: 120,
                        decoration: BoxDecoration(
                          color: Colors.orange,
                          borderRadius: BorderRadius.circular(5)
                        ),
                        child: Center(
                          child: Text("Select customer", style: TextStyle(color: Colors.white)),
                        )
                      ),
                      onTap: (){
                        Navigator.push(
                          context,
                          MaterialPageRoute(builder: (context) => NewReservationMechanic()),
                        );
                      },
                    )
                  )
                ],
              ),
            ),
          ),
        ),
      );
}
