import 'package:flutter/cupertino.dart';
import 'package:flutter/material.dart';

class MediaSosial extends StatefulWidget {
  const MediaSosial({Key? key}) : super(key: key);

  @override
  _MediaSosialState createState() => _MediaSosialState();
}

class _MediaSosialState extends State<MediaSosial> {
  @override
  Widget build(BuildContext context) {
    return Container(
      margin: EdgeInsets.only(left: 20, right: 20),
      child: Column(
        children: [
          Container(
            height: 30,
            padding: EdgeInsets.all(2),
            decoration: BoxDecoration(
              color: Colors.blue,
              borderRadius: BorderRadius.circular(2)
            ),
            child: GestureDetector(
                child: Stack(
                  children: [
                    Align(
                      alignment: Alignment.centerLeft,
                      child: Image.asset("asset/images/login/logo_google.png", height: 30,),
                    ),

                    Align(
                      alignment: Alignment.center,
                      child: Text("Lanjut dengan Google", style: TextStyle(color: Colors.white)),
                    )
                  ],
                )
            ),
          ),

          SizedBox(
            height: 10,
          ),

          Container(
            height: 30,
            padding: EdgeInsets.all(2),
            decoration: BoxDecoration(
                color: Colors.blue,
                borderRadius: BorderRadius.circular(2)
            ),
            child: GestureDetector(
                child: Stack(
                  children: [
                    Align(
                      alignment: Alignment.centerLeft,
                      child: Image.asset("asset/images/login/logo_fb.png", height: 30,),
                    ),

                    Align(
                      alignment: Alignment.center,
                      child: Text("Lanjut dengan Facebook", style: TextStyle(color: Colors.white)),
                    )
                  ],
                )
            ),
          ),

          SizedBox(
            height: 10,
          ),

          Container(
            height: 30,
            padding: EdgeInsets.all(2),
            decoration: BoxDecoration(
                color: Colors.black,
                borderRadius: BorderRadius.circular(2)
            ),
            child: GestureDetector(
                child: Stack(
                  children: [
                    Align(
                      alignment: Alignment.centerLeft,
                      child: Image.asset("asset/images/login/logo_apple.png", height: 30,),
                    ),

                    Align(
                      alignment: Alignment.center,
                      child: Text("Lanjut dengan Apple", style: TextStyle(color: Colors.white)),
                    )
                  ],
                )
            ),
          ),

          SizedBox(
            height: 10,
          ),

          Container(
            height: 30,
            padding: EdgeInsets.all(2),
            decoration: BoxDecoration(
                color: Colors.green,
                borderRadius: BorderRadius.circular(2)
            ),
            child: GestureDetector(
                child: Stack(
                  children: [
                    Align(
                      alignment: Alignment.centerLeft,
                      child: Image.asset("asset/images/login/logo_line.png", height: 30,),
                    ),

                    Align(
                      alignment: Alignment.center,
                      child: Text("Lanjut dengan Line", style: TextStyle(color: Colors.white)),
                    )
                  ],
                )
            ),
          ),

        ],
      ),
    );
  }
}
