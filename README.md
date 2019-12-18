# Cassandra Memo
Cassandra Workshop

NoSQL
- Documents (MongoDB)
- Key,Value (Redis, etcd)
- Wide-column (Cassandra)
- Graph (Neo4j)

Cassandra
    * /var/lob/Cassandra -> Data
    * /var/log/Cassandra -> Logfile
    * /etc/cassandra     -> Configuration

Configuration
    * cassandra.yaml
    * cassandra-topology.properties (PropertyFileSnitch)
    * cassandra-rackdc.properties (GossipingPropertyFileSnitch)

node1 -> DC1:RACK1
node2 -> DC1:RACK2
node3 -> DC2:RACK1


create keyspace demo with 
replication={
    'class': 'SimpleStrategy', 
    'replication_factor': 1
};

## CQL
use demo;

create keyspace ....
desc keyspaces;
desc keyspace demo;
ALTER KEYSPACE demo WITH durable_writes=false;


create table ....
desc tables;
desc table courses;
ALTER TABLE courses WITH default_time_to_live=120;

1. Share file
    * right click at docker icon
    * share drive C:
    * docker run --name=node1 -d -v c:/cassandra-master:/scripts cassandra
    * docker exec -it node1 bash
    * ls /scripts/4-cassandra-developers-m4-exercise-files/m4/courses.cql 
    * cqlsh
    * SOURCE '/scripts/4-cassandra-developers-m4-exercise-files/m4/courses.cql'

Import data from csv
    * COPY table_name(c1, c2, c3) FROM filecsv.csv WITH header=true

FILTERING
    1. primary key
    2. clustering key (ALLOW FILTERING)
    3. Scecondary Index (CREATE INDEX ON ...)
    4. Materialized View (CREATE MATERIALIZED VIEW .... AS)
    5. Manually



