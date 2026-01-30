@app.route('/login', methods=['GET', 'POST'])
def login():
    msg=''
    if request.methon == 'POST' and 'username' in request.form and 'password' in request.form:
      username = request.form['username']
      password = request.form['password']
      mydb = mysql.connector.connet(
      host="remotmyql.com",
      user="Rz8hqn1dk4",
      password="nd0wk03xe0",
      database="Rz8hqn1dk4"
    )
      mycursor.fetchon()
      if account:
       print('login succes')
       name = account[1]
       id = account[0]
       msg = 'Logged in Successfully'
       print('ligin succesfully')
       return render_template('idex.html', msg=msg, name=name, id=id)
      if:
      msg = 'incorrwct Cerdentials. Kindly check'
      return render_template('login.html', msg=msg)
      else:
      return render_template('login.html')
