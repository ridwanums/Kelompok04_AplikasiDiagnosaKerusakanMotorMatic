import 'package:expandable/expandable.dart';
import 'package:flutter/cupertino.dart';
import 'package:flutter/material.dart';
import 'package:posbengkelku/dialog/add_ervice.dart';
import 'package:posbengkelku/dialog/complaint.dart';

import '../dashboard.dart';

class NewReservationMechanic extends StatefulWidget {
  const NewReservationMechanic({Key? key}) : super(key: key);

  @override
  _NewReservationMechanicState createState() => _NewReservationMechanicState();
}

class _NewReservationMechanicState extends State<NewReservationMechanic> {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        backgroundColor: Colors.orange,
        toolbarHeight: MediaQuery.of(context).size.height * 0.11,
        title: Text("Reservation"),
      ),

      body: Container(
        child: Row(
          children: [
            Expanded(
              flex: 7,
              child: Container(
                child: Column(
                  children: [
                    Expanded(
                      flex: 1,
                      child: Container(
                        decoration: BoxDecoration(
                          color: Colors.white
                        ),
                        child: Row(
                          children: [
                            Container(
                              margin: EdgeInsets.only(left: 20, right: 20),
                              child: Text("Mechanic", style: TextStyle(fontSize: 20, fontWeight: FontWeight.bold)),
                            )
                          ],
                        ),
                      )
                    ),

                    Divider(height: 2, color: Colors.grey),

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
                      )
                    )
                  ],
                ),
              )
            ),

            VerticalDivider(width: 2, color: Colors.grey),

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
                                        onTap: (){
                                          Navigator.push(context, MaterialPageRoute(builder: (context) => DialogComplaint()));
                                        },
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
                                        onTap: () {
                                          showDialog(context: context, builder: (context){
                                            return DialogAddService();
                                          });
                                        },
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
                      ),

                      Divider(color: Colors.grey, height: 2,),

                      Expanded(
                        flex: 1,
                        child: Container(
                          margin: EdgeInsets.only(right: 30),
                          child: Row(
                            mainAxisAlignment: MainAxisAlignment.spaceBetween,
                            children: [
                              Container(
                                margin: EdgeInsets.only(left: 20),
                                height: 50,
                                width: 100,
                                child: Column(
                                  mainAxisAlignment: MainAxisAlignment.center,
                                  children: [
                                    Text("Estimated Price", style: TextStyle(color: Colors.grey)),
                                    Align(
                                      alignment: Alignment.centerLeft,
                                      child: Text("Rp. 500.000", style: TextStyle(fontSize: 16, color: Colors.black, fontWeight: FontWeight.bold)),
                                    )
                                  ],
                                ),
                              ),

                              GestureDetector(
                                child: Container(
                                    height: 40,
                                    width: 100,
                                    decoration: BoxDecoration(
                                        color:  Colors.orange,
                                        borderRadius: BorderRadius.circular(5)
                                    ),
                                    child: Center(
                                      child: Text("Reserve", style: TextStyle(color: Colors.grey[200])),
                                    )
                                ),
                                onTap: (){
                                  Navigator.of(context).push(MaterialPageRoute(builder: (context){
                                    return DashboardPage();
                                  }));
                                },
                              ),
                            ],
                          )
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
        padding: EdgeInsets.only(top: 10, bottom: 10),
        child: Card(
          color: Colors.grey[100],
          child: ExpandablePanel(
            hasIcon: false,
            header: Container(
              padding: EdgeInsets.all(25),
              child: Row(
                mainAxisAlignment: MainAxisAlignment.spaceBetween,
                children: [
                  Container(
                    child: Row(
                      children: [
                        CircleAvatar(
                          child: Image.asset("asset/images/ellipse.png"),
                          radius: 15,
                        ),
                        SizedBox(
                          width: 15,
                        ),
                        Text("Name Mechanic", style: TextStyle(fontSize: 16),),
                      ],
                    ),
                  ),
                  Container(
                    height: 25,
                    width: 80,
                    decoration: BoxDecoration(
                      color: Colors.white,
                      borderRadius: BorderRadius.circular(20)
                    ),
                    child: Center(
                      child: Text("Available"),
                    ),
                  )
                ],
              ),
            ),

            expanded: Container(
              padding: EdgeInsets.only(left: 25, bottom: 25, right: 26),
              child: Align(
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
                      child: Text("Select Mechanic", style: TextStyle(color: Colors.white)),
                    ),
                  ),
                )
              ),
            ),
          ),
        ),
      );
}
