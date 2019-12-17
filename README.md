# Ex14OptionMenu
안드로이드 네이티브 앱 개발 수업 예제#14

# 주요코드
OptionMenu 추가하기 [ 제목줄에 보여지는 메뉴여서 ActionBar Menu라고도 함]

- OptionMenu를 만들기 위한 메소드 onCreateOptionsMenu() 오버라이드
- OptionMenu 만들어 추가하는 2가지 방법
  1) 방법1. 자바언어로 메뉴아이템 추가..(잘 사용하지 않음)
  2) 방법 2. XML언어로 메뉴항목들을 설계하고 자바언어의 MenuItem객체로 만들어서(부풀리다inflate) Menu에 추가하는 방법을 사용함.
    > res폴더>>menu폴더 생성 [ res폴더에서 마우스오른쪽버튼 메뉴에서 'Android Resource Directory' 선택 후 위에서 2번째 항목의 'Resource Type'에서 'menu'선택하면 menu폴더 추가됨]
    > menu폴더에 있는 actionbar_main.xml문서를 읽어와서 Menu객체로 만들어주는(부풀려주는inflate) 객체인 MenuInflater사용
- OptionMenu의 Menu(MenuItem)클릭 반응하기

# 실행모습
<div>
  <img src="device-2019-12-17-173337.png" width="19%"/>
  <img src="device-2019-12-17-173532.png" width="19%"/>
  <img src="device-2019-12-17-173615.png" width="19%"/>
</div>

# 실행모습 GIF
<div>
  <img src="GIF.gif" width="20%"/>
</div>
