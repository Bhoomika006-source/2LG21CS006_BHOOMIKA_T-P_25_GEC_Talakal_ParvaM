# Generated by Django 3.2.25 on 2025-03-10 10:04

from django.db import migrations, models


class Migration(migrations.Migration):

    initial = True

    dependencies = [
    ]

    operations = [
        migrations.CreateModel(
            name='Student',
            fields=[
                ('id', models.BigAutoField(auto_created=True, primary_key=True, serialize=False, verbose_name='ID')),
                ('sname', models.CharField(max_length=100)),
                ('sclass', models.CharField(max_length=10)),
                ('ssection', models.CharField(max_length=10)),
                ('sgender', models.CharField(max_length=10)),
                ('sdob', models.DateField()),
            ],
        ),
    ]
