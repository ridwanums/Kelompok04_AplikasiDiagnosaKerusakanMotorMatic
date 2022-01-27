import 'package:flutter/cupertino.dart';
import 'package:flutter/material.dart';
import 'package:shopee12/login/medsos.dart';
import 'package:shopee12/login/uspass.dart';

class LoginPage extends StatefulWidget {
  const LoginPage({Key? key}) : super(key: key);

  @override
  _LoginPageState createState() => _LoginPageState();
}

class _LoginPageState extends State<LoginPage> {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        backgroundColor: Colors.white,
        iconTheme: IconThemeData(color: Colors.orange),
        title: Row(
          mainAxisAlignment: MainAxisAlignment.spaceBetween,
          children: [
            Text(
              "Log In",
              style: TextStyle(
                color: Colors.black,
              ),
            ),

            Container(
              child: Row(
                children: [
                  Container(
                    child: GestureDetector(
                      onTap: (){
                        ScaffoldMessenger.of(context).showSnackBar(SnackBar(
                          backgroundColor: Colors.transparent,
                          content: Text("Add Business", textAlign: TextAlign.center),
                        ));
                      },
                      child: Icon(
                        Icons.add_business,
                        color: Colors.grey,
                      ),
                    ),
                  ),


                  SizedBox(
                    width: 10,
                  ),

                  Container(
                    child: GestureDetector(
                        onTap: (){
                          ScaffoldMessenger.of(context).showSnackBar(SnackBar(
                            backgroundColor: Colors.transparent,
                            content: Text("About", textAlign: TextAlign.center),
                          ));
                        },
                      child: Icon(
                        Icons.question_answer,
                        color: Colors.grey,
                      )
                    ),
                  ),
                ],
              ),
            ),

          ],
        )
      ),

      body: SingleChildScrollView(
        child: Column(
          children: [
            
            Container(
              margin: EdgeInsets.only(top: 20),
              child: Center(
                child: Image.asset("asset/images/login/logo.png", height: 80),
              ),
            ),

            SizedBox(
              height: 30,
            ),
            
            UsernamePassword(),

            SizedBox(
              height: 30,
            ),

            MediaSosial()
          ],
        ),
      ),
    );
  }
}
