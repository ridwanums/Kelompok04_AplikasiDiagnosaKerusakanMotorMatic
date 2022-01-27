import 'package:flutter/cupertino.dart';
import 'package:flutter/material.dart';

class DialogCompalaint extends StatefulWidget {
  const DialogCompalaint({Key? key}) : super(key: key);

  @override
  _DialogCompalaintState createState() => _DialogCompalaintState();
}

class _DialogCompalaintState extends State<DialogCompalaint> {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      body: GestureDetector(
        child: Container(
          color: Colors.black,
          child: Center(
            child: Container(
              height: 450,
              width: 500,
              decoration: BoxDecoration(
                color: Colors.white,
                borderRadius: BorderRadius.circular(10),
              ),
              child: Wrap(
                children: [
                  Container(
                    margin: EdgeInsets.only(left: 20, top: 20),
                    alignment: Alignment.topLeft,
                    child: Text("Complaint", style: TextStyle(fontSize: 18, color: Colors.black, fontWeight: FontWeight.bold)),
                  ),

                  Container(
                    margin: EdgeInsets.only(top: 20, left: 20, right: 20),
                    padding: EdgeInsets.all(10),
                    width: MediaQuery.of(context).size.width,
                    height: MediaQuery.of(context).size.width * 0.22,
                    decoration: BoxDecoration(
                      color: Colors.grey[200],
                      borderRadius: BorderRadius.circular(5),
                    ),
                    child: TextField(
                      keyboardType: TextInputType.multiline,
                      textInputAction: TextInputAction.newline,
                      minLines: 6,
                      maxLines: null,
                      decoration: InputDecoration(
                          border: InputBorder.none,
                          hintText: "ac tidak dingin",
                          hintStyle: TextStyle(color: Colors.grey)
                      ),
                    ),
                  ),

                  SizedBox(
                    height: 20,
                  ),

                  Divider(height: 10, color: Colors.grey),

                  Container(
                    margin: EdgeInsets.only(top: 15),
                    child: Row(
                      mainAxisAlignment: MainAxisAlignment.center,
                      children: [
                        GestureDetector(
                          child: Container(
                            height: 45,
                            width: 120,
                            decoration: BoxDecoration(
                                color: Colors.white,
                                borderRadius: BorderRadius.circular(5),
                                border: Border.all(color: Colors.grey, width: 2)
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
                          width: 15,
                        ),

                        GestureDetector(
                          child: Container(
                            height: 45,
                            width: 120,
                            decoration: BoxDecoration(
                                color: Colors.orange,
                                borderRadius: BorderRadius.circular(5)
                            ),
                            child: Center(
                              child: Text("Submit", style: TextStyle(color: Colors.white),),
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
            ),
          ),
        ),
        onTap: (){
          Navigator.pop(context);
        },
      ),
    );
  }
}
