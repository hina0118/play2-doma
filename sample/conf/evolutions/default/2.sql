# --- !Ups
INSERT INTO User(id, email, password, fullname, admin) VALUES(NEXTVAL('UserSeq'), 'a@mail.com', 'pass', 'tanaka ichirou', true);
INSERT INTO User(id, email, password, fullname, admin) VALUES(NEXTVAL('UserSeq'), 'b@mail.com', 'pass', 'tanaka jirou', false);
INSERT INTO User(id, email, password, fullname, admin) VALUES(NEXTVAL('UserSeq'), 'c@mail.com', 'pass', 'tanaka saburou', false);
INSERT INTO User(id, email, password, fullname, admin) VALUES(NEXTVAL('UserSeq'), 'd@mail.com', 'pass', 'tanaka tarou', false);

# --- !Downs
DELETE FROM User;