import 'package:flutter/cupertino.dart';
import 'package:flutter/material.dart';

class DialogExpanded extends StatefulWidget {
  const DialogExpanded({Key? key}) : super(key: key);

  @override
  _DialogExpandedState createState() => _DialogExpandedState();
}

class _DialogExpandedState extends State<DialogExpanded> {
  @override
  Widget build(BuildContext context) {
    return Dialog(
      shape: RoundedRectangleBorder(
          borderRadius: BorderRadius.circular(5)
      ),
      elevation: 0,
      backgroundColor: Colors.transparent,
      child: contextBox(context),
    );
  }

  contextBox(context) {
    return Container(
      height: 600,
      width: 600,
      color: Colors.white,
      child: Container(
        child: Column(
          children: [
            Container(
              margin: EdgeInsets.only(top: 40),
              child: Image.asset("asset/images/quetion.png", height: 100),
            ),

            Container(
              margin: EdgeInsets.only(top: 20, bottom: 20),
              child: Row(
                mainAxisAlignment: MainAxisAlignment.center,
                children: [
                  Text("Are you sure want to change reservation", style: TextStyle(color: Colors.grey, fontSize: 16)),
                  SizedBox(width: 5),
                  Text("R#9819231", style: TextStyle(color: Colors.black, fontSize: 16)),
                  SizedBox(width: 5),
                  Text("to order", style: TextStyle(color: Colors.grey, fontSize: 16)),
                ],
              ),
            ),

            Divider(height: 2, color: Colors.grey),

            Container(
              margin: EdgeInsets.only(left: 20, right: 20, top: 30),
              padding: EdgeInsets.all(10),
              height: 60,
              color: Colors.grey[200],
              child: Row(
                children: [
                  Text("R#9819321", style: TextStyle(fontSize: 16)),
                  SizedBox(width: 10),
                  Text("Owner name", style: TextStyle(fontSize: 16, color: Colors.grey)),
                  SizedBox(width: 5),
                  Text("-", style: TextStyle(fontSize: 16, color: Colors.grey)),
                  SizedBox(width: 5),
                  Text("Car name", style: TextStyle(fontSize: 16, color: Colors.grey)),
                ],
              ),
            ),

            SizedBox(height: 230),

            Divider(height: 2, color: Colors.grey),

            Container(
              padding: EdgeInsets.only(left: 20, right: 20),
              child: Row(
                mainAxisAlignment: MainAxisAlignment.spaceBetween,
                children: [
                  Container(),
                  Container(
                    child: Row(
                      children: [
                        GestureDetector(
                          child: Container(
                            margin: EdgeInsets.only(top: 20),
                            height: 40,
                            width: 100,
                            decoration: BoxDecoration(
                                color: Colors.white,
                                borderRadius: BorderRadius.circular(5),
                                border: Border.all(color: Colors.grey)
                            ),
                            child: Center(
                              child: Text("Cancel"),
                            ),
                          ),
                          onTap: (){
                            Navigator.pop(context);
                          },
                        ),

                        SizedBox(
                          width: 10,
                        ),

                        GestureDetector(
                          child: Container(
                            margin: EdgeInsets.only(top: 20),
                            height: 40,
                            width: 100,
                            decoration: BoxDecoration(
                              color: Colors.orange,
                              borderRadius: BorderRadius.circular(5),
                            ),
                            child: Center(
                              child: Text("Done", style: TextStyle(color: Colors.white)),
                            ),
                          ),
                          onTap: (){
                            Navigator.pop(context);
                          },
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
    );
  }
}
