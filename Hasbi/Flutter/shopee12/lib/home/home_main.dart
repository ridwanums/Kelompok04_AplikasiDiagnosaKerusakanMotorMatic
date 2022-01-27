import 'package:flutter/cupertino.dart';
import 'package:flutter/material.dart';
import 'package:shopee12/home/pages/bernda/beranda.dart';
import 'package:shopee12/home/pages/feedback.dart';
import 'package:shopee12/home/pages/live.dart';
import 'package:shopee12/home/pages/notifikasi.dart';
import 'package:shopee12/home/pages/profile.dart';

class HomeMainPage extends StatefulWidget {
  const HomeMainPage({Key? key}) : super(key: key);

  @override
  _HomeMainPageState createState() => _HomeMainPageState();
}

class _HomeMainPageState extends State<HomeMainPage> {

  int CurrentIndex = 0;
  final scree = [
    BerandaPage(),
    FeedBackPage(),
    ShopeeLivePage(),
    NotifikasiPage(),
    ProfilePage()
  ];

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      body: scree[CurrentIndex],
      bottomNavigationBar: BottomNavigationBar(
        currentIndex: CurrentIndex,
        type: BottomNavigationBarType.fixed,
        unselectedItemColor: Colors.black,
        selectedItemColor: Colors.orange,
        iconSize: 20,
        // showUnselectedLabels: false,
          onTap: (index) => setState(() => CurrentIndex = index),
        items: [
          BottomNavigationBarItem(
            icon : Icon(Icons.home),
            label : "Beranda"
          ),

          BottomNavigationBarItem(
              icon : Icon(Icons.question_answer),
              label : "Feedback"
          ),

          BottomNavigationBarItem(
              icon : Icon(Icons.videocam),
              label : "Beranda"
          ),

          BottomNavigationBarItem(
              icon : Icon(Icons.notifications),
              label : "Beranda"
          ),

          BottomNavigationBarItem(
              icon : Icon(Icons.person),
              label : "Beranda"
          ),
        ],
      ),
    );
  }
}
