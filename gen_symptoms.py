import csv
import random

file = 'slay-symptoms.csv'

def print_csv():
    with open(file) as csv_file:
        csv_reader = csv.reader(csv_file, delimiter=',')
        line_count = 0
        for row in csv_reader:
            if line_count == 0:
                print(f'Cols    {", ".join(row)}')
                line_count += 1
            else:
                print(f'\t{row[0]} {row[1]} {row[2]} {row[3]} {row[4]} {row[5]} {row[6]} {row[7]} {row[8]}')
                line_count += 1
        print(f'Processed {line_count} lines.')

def write_csv():
    with open(file, mode='w') as symptom_file:
        data_writer = csv.writer(symptom_file, delimiter=',', quotechar='"', quoting=csv.QUOTE_MINIMAL)

        data_writer.writerow(['Day','Cramp','Bloat','Tender','Headache','Fatigue','Hungry','Libido','Acne'])
        for i in range(1,10000):
            data_writer.writerow([i, random.randint(0,1), random.randint(0,1), random.randint(0,1), random.randint(0,1), random.randint(0,1), random.randint(0,1), random.randint(0,1), random.randint(0,1)])

def main():
    day = 1
    write_csv()
    print_csv()

main()
