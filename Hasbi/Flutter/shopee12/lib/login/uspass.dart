import 'package:flutter/cupertino.dart';
import 'package:flutter/material.dart';
import 'package:shopee12/home/home_main.dart';

class UsernamePassword extends StatefulWidget {
  const UsernamePassword({Key? key}) : super(key: key);


  @override
  _UsernamePasswordState createState() => _UsernamePasswordState();
}

class _UsernamePasswordState extends State<UsernamePassword> {

  bool HidePass = true;
  void ToogleVisibility(){
    setState(() {
      HidePass = !HidePass;
    });
  }

  _HorizontalDivider() => BoxDecoration(
    border: Border(
      bottom: BorderSide(
        color: Colors.grey,
        width: 1.1
      )
    )
  );

  _VerticalDivider() => BoxDecoration(
    border: Border(
      right: BorderSide(
        color: Colors.grey,
        width: 0.5
      )
    )
  );


  @override
  Widget build(BuildContext context) {
    return Container(
      margin: EdgeInsets.only(right: 20, left: 20),
      child: Column(
        children: [
          TextField(
            autofocus: false,
            decoration: InputDecoration(
              hintText: "Email",
              prefixIcon: Icon(Icons.email, color: Colors.grey,),
              focusedBorder: UnderlineInputBorder(
                borderSide: BorderSide(color: Colors.grey),
              ),
            ),
          ),

          Container(
            child: Stack(
              children: [
                TextField(
                  autofocus: false,
                  obscureText: HidePass,
                  decoration: InputDecoration(
                    hintText: "Password",
                    prefixIcon: Icon(Icons.vpn_key, color: Colors.grey,),
                    focusedBorder: UnderlineInputBorder(
                      borderSide: BorderSide(color: Colors.grey),
                    ),
                  ),
                ),

                Align(
                  alignment: Alignment.centerRight,
                  child: Container(
                    margin: EdgeInsets.only(top: 13, right: 60),
                    padding: EdgeInsets.only(right: 10),
                    decoration: _VerticalDivider(),
                    child: GestureDetector(
                      onTap: (){
                        ToogleVisibility();
                      },
                      child: Icon(HidePass ? Icons.visibility_off : Icons.visibility, color: Colors.grey),
                    ),
                  ),
                ),

                Align(
                  alignment: Alignment.centerRight,
                  child: TextButton(
                      onPressed: (){
                        ScaffoldMessenger.of(context).showSnackBar(SnackBar(
                          backgroundColor: Colors.transparent,
                          content: Text("Lupa Password", textAlign: TextAlign.center),
                        ));
                      },
                      child: Text("Lupa?")
                  ),
                )
              ],
            ),
          ),

          SizedBox(
            height: 10,
          ),


          Container(
            width: MediaQuery.of(context).size.width,
            color: Colors.white,
            child: ElevatedButton(
                onPressed: (){
                  // ScaffoldMessenger.of(context).showSnackBar(SnackBar(
                  //   backgroundColor: Colors.transparent,
                  //   content: Text("Log in", textAlign: TextAlign.center),
                  // ));
                  Navigator.of(context).push(MaterialPageRoute(builder: (context){
                    return HomeMainPage();
                  }));
                },
                child: Text("Log In"),
            ),
          ),

          SizedBox(
            height: 5,
          ),

          Container(
            padding: EdgeInsets.only(left: 5, right: 5),
            child: Stack(
              children: [
                GestureDetector(
                  child: Align(
                    alignment: Alignment.centerLeft,
                    child: Text(
                      "Daftar",
                      style: TextStyle(
                        color: Colors.blue,
                        fontWeight: FontWeight.bold
                      ),
                    ),
                  ),

                  onTap: (){
                    ScaffoldMessenger.of(context).showSnackBar(SnackBar(
                      backgroundColor: Colors.transparent,
                      content: Text("Daftar", textAlign: TextAlign.center),
                    ));
                  },
                ),

                GestureDetector(
                  child: Align(
                    alignment: Alignment.centerRight,
                    child: Text(
                      "Log in dengan no. handphone",
                      style: TextStyle(
                          color: Colors.blue,
                          fontWeight: FontWeight.bold
                      ),
                    ),
                  ),

                  onTap: (){
                    ScaffoldMessenger.of(context).showSnackBar(SnackBar(
                      backgroundColor: Colors.transparent,
                      content: Text("Log in no. Handphone", textAlign: TextAlign.center),
                    ));
                  },
                ),
              ],
            ),
          ),

          SizedBox(
            height: 20  ,
          ),

          Container(
            child: Row(
              mainAxisAlignment: MainAxisAlignment.center,
              children: [
                Container(
                  height: 3,
                  width: 100,
                  decoration: BoxDecoration(
                    gradient: LinearGradient(
                      begin: Alignment.centerRight,
                      end: Alignment.centerLeft,
                      colors: [
                        Colors.grey,
                        Colors.white
                      ],
                    )
                  ),
                ),

                Text(
                  "ATAU",
                  style: TextStyle(
                    fontSize: 14,
                    fontWeight: FontWeight.bold,
                    color: Colors.grey
                  ),
                ),

                Container(
                  height: 3,
                  width: 100,
                  decoration: BoxDecoration(
                      gradient: LinearGradient(
                        begin: Alignment.centerLeft,
                        end: Alignment.centerRight,
                        colors: [
                          Colors.grey,
                          Colors.white
                        ],
                      )
                  ),
                )
              ],
            ),
          )

        ]
      ),
    );
  }
}
