import 'package:expandable/expandable.dart';
import 'package:flutter/cupertino.dart';
import 'package:flutter/material.dart';
import 'package:posbengkelku/dialog/dialog_add_service.dart';
import 'package:posbengkelku/dialog/dialog_complaint.dart';
import 'package:posbengkelku/page/service/service_reservation.dart';

class NewReservationMechanic extends StatefulWidget {
  const NewReservationMechanic({Key? key}) : super(key: key);

  @override
  _NewReservationMechanicState createState() => _NewReservationMechanicState();
}

class _NewReservationMechanicState extends State<NewReservationMechanic> {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      backgroundColor: Colors.white,
      appBar: AppBar(
        backgroundColor: Colors.orange,
        toolbarHeight: 80,
        title: Text("New Reservation")
      ),

      body: Container(
        child: Row(
          children: [
            Expanded(
              flex: 6,
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
                            Text("Mechanic", style: TextStyle(fontSize: 20, fontWeight: FontWeight.bold)),
                            Container(
                              padding: EdgeInsets.all(5),
                              height: 40,
                              width: 300,
                              decoration: BoxDecoration(
                                color: Colors.grey[200]
                              ),
                              child: Row(
                                children: [
                                  Icon(Icons.search),
                                  SizedBox(width: 5),
                                  Text("Search", style: TextStyle(color: Colors.grey),)
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
                              BuildCard()
                            ],
                          ),
                        )
                    )
                  ],
                ),
              )
            ),

            VerticalDivider(width: 10, color: Colors.grey),
            Expanded(
                flex: 4,
                child: Scaffold(
                  body: Container(
                    child: Column(
                      children: [
                        Container(
                          margin: EdgeInsets.only(left: 20, right: 20, top: 30),
                          child: Stack(
                            children: [
                              Container(
                                child: Text("Customer", style: TextStyle(fontSize: 16, color: Colors.grey)),
                              ),

                              Container(
                                margin: EdgeInsets.only(top: 20),
                                child: Text("Name customer", style: TextStyle(fontSize: 16, color: Colors.black)),
                              ),

                              Align(
                                alignment: Alignment.centerRight,
                                child: Container(
                                  padding: EdgeInsets.only(left: 10, right: 10),
                                  height: 40,
                                  width: 250,
                                  decoration: BoxDecoration(
                                    color: Colors.grey[300],
                                  ),
                                  child: Row(
                                    mainAxisAlignment: MainAxisAlignment.spaceBetween,
                                    children: [
                                      Text("Grand Livina"),
                                      Icon(Icons.arrow_drop_down, size: 35)
                                    ],
                                  ),
                                ),
                              )
                            ],
                          ),
                        ),

                        SizedBox(height: 20),

                        Container(
                          margin: EdgeInsets.only(left: 20, right: 20, top: 10),
                          child: Row(
                            mainAxisAlignment: MainAxisAlignment.spaceBetween,
                            children: [
                              Container(
                                child: Stack(
                                  children: [
                                    Container(
                                      child: Text("Mechanic", style: TextStyle(color: Colors.grey, fontSize: 18)),
                                    ),

                                    Container(
                                      margin: EdgeInsets.only(top: 20),
                                      child: Text("Name Mechanic", style: TextStyle(fontSize: 18)),
                                    )
                                  ],
                                ),
                              ),

                              Container(
                                child: Stack(
                                  children: [
                                    Container(
                                      child: Text("Date", style: TextStyle(color: Colors.grey, fontSize: 18)),
                                    ),

                                    Container(
                                      margin: EdgeInsets.only(top: 20),
                                      child: Text("27-12-2021", style: TextStyle(fontSize: 18)),
                                    )
                                  ],
                                ),
                              ),

                              Container(
                                child: Stack(
                                  children: [
                                    Container(
                                      child: Text("Time", style: TextStyle(color: Colors.grey, fontSize: 18)),
                                    ),

                                    Container(
                                      margin: EdgeInsets.only(top: 20),
                                      child: Text("14:46", style: TextStyle(fontSize: 18)),
                                    )
                                  ],
                                ),
                              )
                            ],
                          ),
                        ),

                        Container(
                          margin: EdgeInsets.only(left: 20, right: 20, top: 30),
                          child: Divider(height: 10, color: Colors.grey,),
                        ),

                        Container(
                          margin: EdgeInsets.only(left: 20, right: 20, top: 10),
                          child: Row(
                            mainAxisAlignment: MainAxisAlignment.spaceBetween,
                            children: [
                              Text("Complaint", style: TextStyle(fontSize: 18, color: Colors.black, fontWeight: FontWeight.bold)),
                              GestureDetector(
                                child: Container(
                                  height: 40,
                                  width: 120,
                                  decoration: BoxDecoration(
                                      color: Color.fromRGBO(214, 231, 255, 100),
                                      borderRadius: BorderRadius.circular(5)
                                  ),
                                  child: Center(
                                    child: Text("Add Complaint", style: TextStyle(color: Colors.orange)),
                                  ),
                                ),
                                onTap: (){
                                  Navigator.push(context, MaterialPageRoute(builder: (context) => DialogCompalaint()));
                                },
                              )
                            ],
                          ),
                        ),

                        Container(
                          margin: EdgeInsets.only(left: 20, right: 20, top: 10),
                          child: Divider(height: 10, color: Colors.grey,),
                        ),

                        Container(
                          margin: EdgeInsets.only(left: 20, right: 20, top: 10),
                          child: Row(
                            mainAxisAlignment: MainAxisAlignment.spaceBetween,
                            children: [
                              Text("Services", style: TextStyle(fontSize: 18, color: Colors.black, fontWeight: FontWeight.bold)),
                              GestureDetector(
                                child: Container(
                                  height: 40,
                                  width: 120,
                                  decoration: BoxDecoration(
                                      color: Color.fromRGBO(214, 231, 255, 100),
                                      borderRadius: BorderRadius.circular(5)
                                  ),
                                  child: Row(
                                    mainAxisAlignment: MainAxisAlignment.center,
                                    children: [
                                      Icon(Icons.add, color: Colors.orange, size: 15,),
                                      SizedBox(width: 5),
                                      Text("Add Service", style: TextStyle(color: Colors.orange)),
                                    ],
                                  ),
                                ),
                                onTap: (){
                                  showDialog(context: context, builder: (context){
                                    return DialogAddServices();
                                  });
                                },
                              )
                            ],
                          ),
                        ),

                        Container(
                          margin: EdgeInsets.all(20),
                          child: Row(
                            mainAxisAlignment: MainAxisAlignment.spaceBetween,
                            children: [
                              Text("Service Selected", style: TextStyle(fontSize: 16, color: Colors.grey)),
                              Container(
                                width: 150,
                                child: Text("Price", style: TextStyle(fontSize: 16, color: Colors.grey)),
                              )
                            ],
                          ),
                        ),

                        Container(
                          margin: EdgeInsets.only(left: 20, right: 20),
                          padding: EdgeInsets.only(left: 10, right: 10),
                          height: 50,
                          color: Colors.grey[200],
                          child: Row(
                            mainAxisAlignment: MainAxisAlignment.spaceBetween,
                            children: [
                              Text("General checking", style: TextStyle(fontSize: 16)),

                              Container(
                                width: 150,
                                child: Row(
                                  mainAxisAlignment: MainAxisAlignment.spaceBetween,
                                  children: [
                                    Text("500.000", style: TextStyle(fontSize: 16, color: Colors.grey)),
                                    Container(
                                      height: 20,
                                      width: 20,
                                      decoration: BoxDecoration(
                                          color: Colors.grey[400],
                                          borderRadius: BorderRadius.circular(5)
                                      ),
                                      child: Center(
                                        child: Icon(Icons.close, size: 15, color: Colors.white,),
                                      ),
                                    )
                                  ],
                                ),
                              )
                            ],
                          ),
                        ),

                        Container(
                          margin: EdgeInsets.only(left: 20, right: 20),
                          height: MediaQuery.of(context).size.height * 0.24,
                          child: ListView(
                            children: [
                              Container(
                                padding: EdgeInsets.only(left: 10, right: 10),
                                margin: EdgeInsets.only(top: 10),
                                height: 50,
                                decoration: BoxDecoration(
                                    color: Colors.grey[200]
                                ),
                                child: Row(
                                  mainAxisAlignment: MainAxisAlignment.spaceBetween,
                                  children: [
                                    Text("Service mame", style: TextStyle(fontSize: 16)),
                                    Container(
                                      width: 150,
                                      child: Row(
                                        mainAxisAlignment: MainAxisAlignment.spaceBetween,
                                        children: [
                                          Text("100.000", style: TextStyle(fontSize: 16, color: Colors.grey)),
                                          Container(
                                            height: 20,
                                            width: 20,
                                            decoration: BoxDecoration(
                                                color: Colors.orange,
                                                borderRadius: BorderRadius.circular(5)
                                            ),
                                            child: Center(
                                              child: Icon(Icons.close, size: 15, color: Colors.white,),
                                            ),
                                          )
                                        ],
                                      ),
                                    )
                                  ],
                                ),
                              )
                            ],
                          ),
                        ),

                        Divider(height: 10, color:Colors.grey),

                        Container(
                          margin: EdgeInsets.only(left: 20, right: 20, top: 10),
                          child: Row(
                            mainAxisAlignment: MainAxisAlignment.spaceBetween,
                            children: [
                              Container(
                                child: Column(
                                  children: [
                                    Text("Estimated Price"),
                                    SizedBox(height: 10),
                                    Text("600.000")
                                  ],
                                ),
                              ),

                              GestureDetector(
                                child: Container(
                                  height: 50,
                                  width: 130,
                                  decoration: BoxDecoration(
                                      color: Colors.orange,
                                      borderRadius: BorderRadius.circular(5)
                                  ),
                                  child: Center(
                                    child: Text("Reserve", style: TextStyle(color: Colors.white),),
                                  ),
                                ),
                                onTap: (){
                                  Navigator.push(context, MaterialPageRoute(builder: (context) => ServiceReservationPage()));
                                },
                              )

                            ],
                          ),
                        )
                      ],
                    ),
                  ),
                )
            )
          ],
        ),
      ),
    );
  }

  BuildCard() =>
      Padding(
        padding: EdgeInsets.only(left: 20, right: 20, top: 10),
        child: Card(
          color: Colors.grey[200],
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
                        Container(
                          child: Row(
                            children: [
                              CircleAvatar(
                                child: Image.asset("asset/images/ellipse.png"),
                                radius: 15,
                              ),
                              SizedBox(width: 10),
                              Text("Name Mechanic", style: TextStyle(color: Colors.black, fontWeight: FontWeight.bold))
                            ],
                          ),
                        )
                      ],
                    ),
                  ),

                  Container(
                    height: 30,
                    width: 100,
                    decoration: BoxDecoration(
                      color: Colors.grey[400],
                      borderRadius: BorderRadius.circular(50)
                    ),
                    child: Center(
                      child: Text("Reserved"),
                    ),
                  )
                ],
              ),
            ),

            expanded: Container(
              padding: EdgeInsets.all(20),
              child: Row(
                mainAxisAlignment: MainAxisAlignment.spaceBetween,
                children: [
                  Container(),
                  Container(
                    height: 40,
                    width: 120,
                    decoration: BoxDecoration(
                      color: Colors.orange,
                      borderRadius: BorderRadius.circular(5)
                    ),
                    child: Center(
                      child: Text("Select Mechanic", style: TextStyle(color: Colors.white),),
                    ),
                  )
                ],
              ),
            ),
          ),
        ),
      );
}
