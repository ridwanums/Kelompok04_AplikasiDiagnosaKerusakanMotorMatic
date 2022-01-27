import 'package:flutter/cupertino.dart';
import 'package:flutter/material.dart';

class DialogAddService extends StatefulWidget {
  const DialogAddService({Key? key}) : super(key: key);

  @override
  _DialogAddServiceState createState() => _DialogAddServiceState();
}

class _DialogAddServiceState extends State<DialogAddService> {
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
      width: 570,
      decoration: BoxDecoration(
        color: Colors.white,
        borderRadius: BorderRadius.circular(10)
      ),
      child: Column(
        children: [
          Container(
            padding: EdgeInsets.only(top: 20, bottom: 20, left: 30, right: 30),
            height: 80,
            decoration: BoxDecoration(
              color: Colors.orange,
              borderRadius: BorderRadius.only(topLeft: Radius.circular(10), topRight: Radius.circular(10))
            ),
            child: Row(
              mainAxisAlignment: MainAxisAlignment.spaceBetween,
              children: [
                Text("Add Service", style: TextStyle(fontSize: 18, fontWeight: FontWeight.bold, color: Colors.white)),
                Container(
                  padding: EdgeInsets.all(10),
                  height: 40,
                  width: 250,
                  color: Colors.white,
                  child: Row(
                    children: [
                      Icon(Icons.search, color: Colors.grey,),
                      Text("search here", style: TextStyle(fontSize: 18, color: Colors.grey))
                    ],
                  ),
                )
              ],
            ),
          ),

          Container(
            margin: EdgeInsets.only(top: 20, left: 30, right: 30),
            child: Row(
              children: [
                Text("Service category :", style: TextStyle(fontSize: 16, color: Colors.grey)),
                SizedBox(
                  width: 10,
                ),
                Container(
                  height: 30,
                  width: MediaQuery.of(context).size.width * 0.29,
                  child: ListView(
                    scrollDirection: Axis.horizontal,
                    children: [
                      for(int i = 0; i < 5; i++)
                        Center(
                          child: Container(
                            margin: EdgeInsets.only(left: 15, right: 15),
                            child: GestureDetector(
                              child: Text("lorem", style: TextStyle(fontSize: 18, color: Colors.black)),
                            )
                          ),
                        )
                    ],
                  ),
                )
              ],
            ),
          ),

          Container(
            margin: EdgeInsets.all(30),
            height: MediaQuery.of(context).size.height * 0.45,
            width: MediaQuery.of(context).size.width,
            child: ListView(
              children: [
                for(int i = 0; i < 5; i++)
                  Container(
                    margin: EdgeInsets.only(top: 10, bottom: 10),
                    padding: EdgeInsets.all(10),
                    height: 50,
                    decoration: BoxDecoration(
                      color: Colors.grey[200],
                    ),
                    child: Row(
                      mainAxisAlignment: MainAxisAlignment.spaceBetween,
                      children: [
                        Text("Piston Cleaning", style: TextStyle(fontSize: 16, color: Colors.black)),
                        Text("10.000", style: TextStyle(fontSize: 16, color: Colors.grey)),
                        Icon(Icons.add),
                      ],
                    ),
                  )
              ],
            ),
          ),

          Divider(height: 3, color: Colors.grey),

          Container(
            margin: EdgeInsets.only(top: 10),
            padding: EdgeInsets.only(left: 20, right: 20),
            child: Row(
              mainAxisAlignment: MainAxisAlignment.spaceBetween,
              children: [
                Center(
                  child: Text("0 service selected"),
                ),

                Container(
                  child: Row(
                    children: [
                      GestureDetector(
                        child: Container(
                          height: 40,
                          width: 120,
                          decoration: BoxDecoration(
                              color: Colors.white,
                              borderRadius: BorderRadius.circular(5),
                              border: Border.all(width: 2, color: Colors.grey)
                          ),
                          child: Center(
                            child: Text("Cancel", style: TextStyle(color: Colors.grey),),
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
                          height: 40,
                          width: 120,
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
                      ),
                    ],
                  ),
                )
              ],
            ),
          )
        ],
      ),
    );
  }
}
